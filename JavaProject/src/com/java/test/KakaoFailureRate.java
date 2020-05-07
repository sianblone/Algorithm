package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class KakaoFailureRate {
	
	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		HashMap<Integer, Double> failureMap = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++) {
			int countArrival = 0;
			int countFailure = 0;
			
			for(int j = 0 ; j < stages.length ; j++) {
				// stages 배열[j]의 값이
				// 현재 실패율 구하는 스테이지 번호 (i+1)과 같으면 n스테이지 도달 수, 실패 수 카운트 ++
				// (인덱스는 0부터 시작이므로 실제로 1스테이지는 인덱스 0번에 저장된다)
				if(stages[j] == i+1) {
					countArrival++;
					countFailure++;
				} else if(stages[j] > i+1) {
					// 현재 실패율 구하는 스테이지 번호보다 크면 도달 수 카운트 ++
					countArrival++;
				}
			}
			failureMap.put(i+1, (double)countFailure / (double)countArrival);
		}
		
		List<Integer> keySetList = new ArrayList<>(failureMap.keySet());
		
		Collections.sort(keySetList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(failureMap.get(o1) < failureMap.get(o2)) {
					return 1;
				} else if (failureMap.get(o1) > failureMap.get(o2)) {
					return -1;
				}
				return 0;
			}
			
		});
		
		int[] answer = new int[keySetList.size()];
		for(int i = 0 ; i < keySetList.size() ; i++) {
			answer[i] = keySetList.get(i);
		}
		
		for(int i = 0 ; i < keySetList.size() ; i++) {
			System.out.println(answer[i]);
		}
		
	}
}