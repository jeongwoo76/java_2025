package com.company.ioctest;

public class CalTriangle implements Calc {
	@Override public double exec(double d1, double d2) { 
		return d1*d2*0.5; 
	}
}
