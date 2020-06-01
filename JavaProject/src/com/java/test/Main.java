package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testNum = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testNum; i++) {
			String[] arrInput = br.readLine().split(" ");
			int n = Integer.valueOf(arrInput[0]);
			int k = Integer.valueOf(arrInput[1]);
			int[] arrInt = new int[k];
			int index = 0;
			for(int j = 0; index < k; j++) {
				if((j + 1) % n != 0) {
					arrInt[index++] = j + 1;
				}
			}
			System.out.println(arrInt[k-1]);
		}
		
	}
}