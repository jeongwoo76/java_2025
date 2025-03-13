package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_book {
	public static void main(String[] args) {
	try {	
	//#1. URL
	//	https://openapi.naver.com/v1/search/book.xml	XML
	//	https://openapi.naver.com/v1/search/book.json	JSON
		
	String apiurl = "https://openapi.naver.com/v1/search/book.xml?query="
					+ URLEncoder.encode("경제","UTF-8");
	URL url = new URL(apiurl);
	//#2. HttpURLConnection
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	
	//#3. 요청설정
	conn.setRequestMethod("GET");
	conn.setRequestProperty("X-Naver-Client-Id", "SBBWu3Ld0Cb0nM_iMmZ7");
	conn.setRequestProperty("X-Naver-Client-Secret", "uQBnJreiIr");

	//#4. 응답확인 - 200
	//System.out.println( conn.getResponseCode() );
	int code = conn.getResponseCode();
	BufferedReader br;
	if( code == 200 ) { br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
	}else {
		br =new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	}
	//#5. 응답데이터 - xml/json/csv
	String line =""; StringBuffer sb = new StringBuffer();
	while( (line =br.readLine()) != null) { sb.append(line + "\n"); }
	
	System.out.println(sb.toString() );
	br.close(); conn.disconnect();
		
	}catch(Exception e) { e.printStackTrace(); }
	
	
	}
}
/*
https://developers.naver.com/docs/serviceapi/search/book/book.md#%EC%B1%85


#1.
Client ID	 	SBBWu3Ld0Cb0nM_iMmZ7
Client Secret	uQBnJreiIr

#2. URL
https://openapi.naver.com/v1/search/book.xml	XML
https://openapi.naver.com/v1/search/book.json	JSON

#3. 요청파라미터
GET           query /
> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}



*/