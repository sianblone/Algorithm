package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeforces640Div4 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testNum = Integer.valueOf(br.readLine());
		
		for(int i = 0 ; i < testNum ; i++) {
			
			int n = Integer.valueOf(br.readLine());
			String out = "";
			int digit = 1;
			int count = 0;
			
			while(n > 0) {
				if(n % 10 != 0) {
					//6000 -> 6000
					//5009 -> 5000 9
					//9876 -> 9000 800 70 6
					out += n % 10 * digit + " ";
					count++;
				}
				n /= 10;
				digit *= 10;
			}
			System.out.println(count);
			System.out.println(out);
		}
	}
}