package com.company.java007;

public class Repeat003 {
	public static void main(String[] args) {
		
		for (int i=10; i<=30; i+=10) { System.out.print(i+"\t"); }      System.out.println();
		
		int i=10; while( i<=30 ) { System.out.print(i+"\t"); i+=10; }   System.out.println();
		
		i=10; do { System.out.print(i+"\t"); i+=10; }while( i<=30 );    System.out.println();
		
		
	}  // end main
}     // end class
  