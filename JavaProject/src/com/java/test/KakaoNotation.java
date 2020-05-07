package com.java.test;

import java.io.IOException;

public class KakaoNotation {
	
	public static void main(String[] args) throws IOException {
		
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 2;
		
		// n진법으로 변환한 숫자 모음 배열 크기 = 인원 * (구할 숫자 - 1) + 내 순서
		String[] arrStr = new String[m * (t-1) + p];
		// arrStr의 index
		int index = 0;
		
		for(int i = 0 ; index < arrStr.length ; i++) {
			
			// 숫자 n진법으로 변환
			String newNum = "";
			String oldNum = "";
			
			// i가 0일 때
			if(i == 0) {
				arrStr[index++] = "0";
				continue;
			}
			
			// i가 0이 아닐 때
			int num = i;
			
			while(num > 0) {
				newNum = Integer.toHexString(num % n).toUpperCase() + oldNum;
				num /= n;
				oldNum = newNum;
			}
			// 숫자 n진법 배열
			String[] arrNum = newNum.split("");
			// 배열의 0부터 arrStr[index]에 담고 index++
			for(int j = 0 ; j < arrNum.length ; j++) {
				if(index < arrStr.length) {
					arrStr[index++] = arrNum[j];
				} else break;
			}
		}
		
		String answer = "";
		for(int i = p-1 ; i < arrStr.length ; i += m) {
			answer += arrStr[i];
		}
		
		System.out.println(answer);
		
	}
}