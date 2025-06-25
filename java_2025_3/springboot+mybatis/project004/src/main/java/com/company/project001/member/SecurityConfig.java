package com.company.project001.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.company.project001.oauth.PrincipalOauth2UserService;
import com.company.project001.util.JwtTokenFilter;
import com.company.project001.util.JwtUtil;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired PrincipalOauth2UserService principalOauth2UserService;
    @Autowired JwtUtil jwtUtil;

    // 👉 존재하지 않아도 Null 주입 허용
    @Autowired(required = false)
    private ClientRegistrationRepository clientRegistrationRepository;

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http, MemberService memberService) throws Exception {

        JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(memberService, jwtUtil);

        http
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
            .and()
            .authorizeRequests()
                .antMatchers("/api/member/login", "/api/member/join").permitAll()
                .antMatchers("/member/login", "/member/join", "/resorces/**").permitAll()
                .antMatchers("/board/**", "/member/member").authenticated()
                .anyRequest().permitAll()
            .and()
            .formLogin()
                .loginPage("/member/login")
                .loginProcessingUrl("/member/login")
                .defaultSuccessUrl("/member/member", true)
                .failureUrl("/member/login?error=true")
            .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                .logoutSuccessUrl("/member/login")
                .invalidateHttpSession(true);

        // 👉 OAuth2 로그인 설정은 존재할 경우에만 추가
        if (clientRegistrationRepository != null) {
            http
                .oauth2Login()
                    .loginPage("/member/login")
                    .defaultSuccessUrl("/member/member")
                    .userInfoEndpoint()
                    .userService(principalOauth2UserService);
        }

        http
            .exceptionHandling()
            .authenticationEntryPoint((request, response, authException) -> {
                if (!request.getRequestURI().startsWith("/api/")) {
                    response.sendRedirect("/member/login?error=true");
                } else {
                    response.setStatus(401);
                    response.setContentType("application/json");
                    response.getWriter().write("{\"error\":\"Unauthorized\"}");
                }
            })
            .accessDeniedHandler((request, response, accessDeniedException) -> {
                if (!request.getRequestURI().startsWith("/api/")) {
                    response.sendRedirect("/member/login?error=true");
                } else {
                    response.setStatus(403);
                    response.setContentType("application/json");
                    response.getWriter().write("{\"error\":\"Unauthorized\"}");
                }
            });

        http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws Exception {
        return auth.getAuthenticationManager();
    }

    // 필요 시 활성화
    // @Bean
    // PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }
}
