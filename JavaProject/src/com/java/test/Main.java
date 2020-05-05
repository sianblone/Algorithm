package com.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.valueOf(br.readLine());
		int layerLastNum = 0;
		int layer = 1;
		
		if(input == 1) {
			System.out.println(1);
		} else {
			while ((input - 2) / 6 > layerLastNum) {
				layerLastNum += ++layer;
			}
			System.out.println(layer + 1);
		}
		
	}
}