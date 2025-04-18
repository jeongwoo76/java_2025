package com.thejoa.boot008.util5_kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Component
public class KaKaoLogin {
	@Value("${kakao_redirect_uri}")
	private String kakao_redirect_uri;
	
	@Value("${kakao_api}")
	private String kakao_api;
	
	// 1. login - 인증(사용자신원확인) , 인가(접근권한)
	public String step1() {
		return "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="
					+ kakao_api
					+ "&redirect_uri="
					+ kakao_redirect_uri; 
	}
	
	//2. 인가코드를 토큰
	public List<String> step2(String code) { // code
		System.out.println(".......... STEP1) " + code);
		String tokenUrl="https://kauth.kakao.com/oauth/token";
		tokenUrl +=	  "?grant_type=authorization_code"
					+ "&client_id=" + kakao_api 
					+ "&redirect_uri=" +kakao_redirect_uri
					+ "&code=" +code;
		URL url = null; HttpURLConnection conn = null;
		BufferedReader br = null; String line=""; StringBuffer buffer = new StringBuffer();
		String resultToken="";
		
		try {
			url = new URL(tokenUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoInput(true); conn.setDoOutput(true);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			
			if(conn.getResponseCode()==200) {
					br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else { br=new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
			
			while( (line =br.readLine()) !=null ) { buffer.append(line); }
			br.close();
			conn.disconnect();
			resultToken = buffer.toString();
			System.out.println("............." + resultToken);
			
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		//.......... STEP1) u7pUCjhwmXGg7DHeacx6bQc8hLFdwbKlcQaY_FhDJp9oqok95TM_NgAAAAQKFwFQAAABlkbQGT1tZc76WqiBKA
		//.............{"access_token":"IzmJKvLwJ1M_7RIFp79kbCMErI5QA1vpAAAAAQoNH5cAAAGWRtAahcwhKCpFsU
		// com.google.gson
		JsonObject job = JsonParser.parseString(resultToken).getAsJsonObject();
		String token = job.get("access_token").getAsString();

		System.out.println("..........." + token);
		
		return step3(token); // ##마지막수정
	}
	
	// 사용자정보가져오기
	// nickname, profile_img
	public List<String> step3(String token) { // code
		System.out.println(".......... STEP2) " + token);
		List<String> userinfos = new ArrayList<>();
		
		String userUrl="https://kapi.kakao.com/v2/user/me";
		
		URL url = null; HttpURLConnection conn = null;
		BufferedReader br = null; String line=""; StringBuffer buffer = new StringBuffer();
		String result="";
		
		try {
			url = new URL(userUrl);
			conn =(HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			conn.setRequestProperty("Authorization", "Bearer " + token ); //##
		
			if(conn.getResponseCode()==200) {
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else { br=new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
			
			while( (line =br.readLine()) !=null ) { buffer.append(line); }
			br.close();
			conn.disconnect();
		
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); } 
		
		
		/*
		.......... STEP2) eDeMVlYo84VwtQ1S1kw8UKcWovobC1x8AAAAAQoNCB4AAAGWRwHoJ8whKCpFsUJR
		........{"id":4221815551,
		"connected_at":"2025-04-18T02:50:39Z",
		"properties":{"nickname":"jw","profile_image":"http://img1.kakaocdn.net/thu
		*/
		
		result = buffer.toString(); System.out.println("........" + result);
		JsonObject job = JsonParser.parseString(result).getAsJsonObject();
		userinfos.add(job.getAsJsonObject("properties").get("nickname").getAsString());
		userinfos.add(job.getAsJsonObject("properties").get("profile_image").getAsString());
		System.out.println("..........." + userinfos);
		
		return userinfos;
	
	}	
}









