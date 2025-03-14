package com.company.java019;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network001_InetAddress {
	public static void main(String[] args) {
		//#1.
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. ip hostname : " + local.getHostName());
			System.out.println("1. ip hostAddress : " + local.getHostAddress());
			// 192.168.40.79
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("3. naver: "+local);
			
		} catch (UnknownHostException e) { e.printStackTrace(); } 
		
	} // end main
}     // end class
