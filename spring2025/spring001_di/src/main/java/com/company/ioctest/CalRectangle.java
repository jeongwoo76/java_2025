package com.company.ioctest;

public class CalRectangle implements Calc {
	@Override public double exec(double d1, double d2) { 
		return d1*d2; 
	}
}
