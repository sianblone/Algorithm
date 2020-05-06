package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apt {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		int testNum = Integer.valueOf(br.readLine());
		
		for(int i = 0 ; i < testNum ; i++) {
			
			int floor = Integer.valueOf(br.readLine());
			int num = Integer.valueOf(br.readLine());
			
			int[][] arrApt = new int[floor+1][num];
			
			for(int j = 0 ; j < floor + 1 ; j++) {
				
				int[] arrFloor = new int[num];
				
				if(j == 0) {
					for(int k = 0 ; k < num ; k++) {
						 arrFloor[k] = k + 1;
					}
				} else if (j == floor) {
					for(int l = 0 ; l < num ; l++) {
						arrFloor[num - 1] += arrApt[j-1][l];
					}
				} else {
					for(int k = 0 ; k < num ; k++) {
						for(int l = 0 ; l <= k ; l++) {
							arrFloor[k] += arrApt[j-1][l];
						}
					}
				}
				arrApt[j] = arrFloor;
			}
			
			System.out.println(arrApt[floor][num-1]);
		}
	}
}