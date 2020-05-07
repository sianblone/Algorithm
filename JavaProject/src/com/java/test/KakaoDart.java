package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KakaoDart {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		String dartResult = br.readLine();
		char[] arrChar = dartResult.toCharArray();
		
		int[] arrScore = new int[3];
		int index = -1;
		int sum = 0;
		
		for(int i = 0 ; i < arrChar.length ; i++) {
			if(arrChar[i] == '1' && arrChar[i+1] == '0') {
				arrScore[++index] = 10;
				i++;
			} else if(arrChar[i] >= '0' && arrChar[i] <= '9') {
				arrScore[++index] = arrChar[i] - '0';
			} else if(arrChar[i] == 'D') {
				arrScore[index] = (int) Math.pow(arrScore[index], 2);
			} else if(arrChar[i] == 'T') {
				arrScore[index] = (int) Math.pow(arrScore[index], 3);
			} else if(arrChar[i] == '*') {
				arrScore[index] *= 2;
				if(index > 0) {
					arrScore[index-1] *= 2;
				}
			} else if(arrChar[i] == '#') {
				arrScore[index] *= -1;
			}
		}
		
		for(int i = 0 ; i < arrScore.length ; i++) {
			sum += arrScore[i];
		}
		System.out.println(sum);
	}
}