package com.company.java017;

import java.io.File;
import java.io.IOException;

public class JavaIO001 {
	public static void main(String[] args) {
		String foler_rel="C:\\java017\\"; 
		//String foler_rel="src/com/company/java017/";
		String file_rel="file001.txt";
		
		File folder = new File(foler_rel);
		File file 	= new File(foler_rel+file_rel);
		try {
			if(!folder.exists() ) { folder.mkdir();       }
			if(  !file.exists() ) { file.createNewFile(); }
			System.out.println("폴더/파일 준비완료!");
		}catch(IOException e) {e.printStackTrace();}
		
		// 1) ctrl + f11 실행하고 2) f5 패키지 새로고침해서 파일 확인
		
	} // end main
}     // end class

