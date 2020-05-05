package com.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Honeycomb2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.valueOf(br.readLine());
		int lastNum = 1;
		int multipleSix = 0;
		int layer = 1;
		
		if(input != 1) {
			while (input > lastNum) {
				layer++;
				multipleSix += 6;
				lastNum += multipleSix;
	        }
		}
		
		System.out.println(layer);
	}
}