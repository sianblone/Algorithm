package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.valueOf(br.readLine());
		int lastNum = 1;
		int line = 1;
		while(input > lastNum) {
			lastNum = ++line * (line + 1) / 2;
		}
		
		int index = line - (lastNum - input);
		
		if(line % 2 == 0) {
			System.out.println(index + "/" + (line + 1 - index));
		} else {
			System.out.println((line + 1 - index) + "/" + index);
		}
		
	}
}