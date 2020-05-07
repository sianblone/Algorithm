package com.java.test;

import java.io.IOException;

public class Notation {
	
	// 숫자를 n진법으로 계산하기 
	public static void main(String[] args) throws IOException {
		
		int n = 3;
		int num = 4;
		int staticNum = num;
		
		String newNum = "";
		String oldNum = "";
		
		while(num > 0) {
			newNum = num % n + oldNum;
			num /= n;
			
			oldNum = newNum;
		}
		
		System.out.println(staticNum + " (" + n + "진법)" + " = " + newNum);
	}
}