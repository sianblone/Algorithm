package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACM {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		int testNum = Integer.valueOf(br.readLine());
		
		for(int i = 0 ; i < testNum ; i++) {
			String[] arrStr = br.readLine().split(" ");
			
			int h = Integer.valueOf(arrStr[0]);
			int n = Integer.valueOf(arrStr[2]);
			
			int hh = 0;
			int ww = 0;
			String strW = "";
			
			hh = n % h == 0 ? h : n % h;
			ww = (n - 1) / h + 1;
			strW = ww < 10 ? "0" + ww : ww+""; 
			System.out.println(hh + strW);
		}
	}
}