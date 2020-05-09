package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KakaoCT1 {
	
	public static void main(String[] args) throws IOException {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		int[][] num = {{1,2,3},{4,5,6},{7,8,9},{10,0,10}};
		int[] left = {3,0};
		int[] right = {3,2};
		boolean check = false;
		String answer = "";
		
		// numbers 길이만큼 answer 반환
		for(int i = 0 ; i < numbers.length ; i++) {
			
			// 다이얼 2차원 배열 길이만큼 탐색 
			for(int j = 0 ; j < num.length ; j++) {
				check = false;
				// j,0 ~ j,2까지 탐색  
				for(int k = 0 ; k < num[j].length ; k++) {
					// 누를 번호가 num[j][k]와 같으면
					if(numbers[i] == num[j][k]) {
						// 누를 번호가 1,4,7인 경우
						if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
							left[0] = j;
							left[1] = k;
							answer += "L";
						} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
							// 누를 번호가 3,6,9인 경우
							right[0] = j;
							right[1] = k;
							answer += "R";
						} else {
							// 누를 번호가 2,5,8,0인 경우 현재 왼손엄지, 오른손엄지부터 거리와 비교하기
							if(Math.abs(left[0] - j) + Math.abs(left[1] - k) < Math.abs(right[0] - j) + Math.abs(right[1] - k)) {
								left[0] = j;
								left[1] = k;
								answer += "L";
							} else if(Math.abs(left[0] - j) + Math.abs(left[1] - k) > Math.abs(right[0] - j) + Math.abs(right[1] - k)) {
								right[0] = j;
								right[1] = k;
								answer += "R";
							} else {
								if(hand.equals("left")) {
									left[0] = j;
									left[1] = k;
									answer += "L";
								} else {
									right[0] = j;
									right[1] = k;
									answer += "R";
								}
							}
						}
						check = true;
						break;
					}
				}
				if(check) break;
			}
		}
		
		System.out.println(answer);
		
	}
}