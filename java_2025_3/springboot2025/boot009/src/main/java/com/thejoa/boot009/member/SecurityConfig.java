package com.thejoa.boot009.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(
			(authorizeHttpRequests) -> authorizeHttpRequests
										.requestMatchers(new AntPathRequestMatcher("/**"))
										.permitAll()
		).formLogin(
			(formLogin) -> formLogin
								.loginPage("/member/login")
								.defaultSuccessUrl("/member/member")
		).logout(
			(logout) -> logout
							.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
							.logoutSuccessUrl("/member/login")
							.invalidateHttpSession(true)	
		);
		return http.build();
	}

	@Bean
	AuthenticationManager authenticationManager(
			AuthenticationConfiguration authenticationConfiguration
	) throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	@Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }
	
}
