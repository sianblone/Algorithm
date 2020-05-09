package com.java.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoCT3 {
	
	public static void main(String[] args) throws IOException {
		String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
		int[] answer = new int[2];
		Map<String, Boolean> gemMap = new HashMap<>();
		// 모든 보석 종류 Map에 저장
		for(int i = 0 ; i < gems.length ; i++) {
			if(gemMap.get(gems[i]) == null) {
				gemMap.put(gems[i], true);
			}
		}
		List<String> gemList = new ArrayList<>(gemMap.keySet());
		
		List<String> buyList = new ArrayList<>();
		for(int i = 0 ; i < gems.length ; i++) {
			// 모든 종류의 보석 샀는지 확인하기
			int j = 0;
			for( ; j < gemMap.size() ; j++) {
				if(gemMap.get(gemList.get(j))) {
					// 아직 true인 보석이 하나라도 있으면 보석 사기
					buyList.add(gems[i]);
					// 보석맵 false로 바꿔주기
					gemMap.put(gems[i], false);
					// 모든 보석 샀는지 확인하는 반복문 끝내기
					break;
				}
			}
			// j가 gemMap의 사이즈 - 1보다 작으면 보석을 산 것이므로 다음 진열된 보석으로
			if(j < gemMap.size() - 1) continue;
			// 모든 종류의 보석을 샀다면 반복문 종료
			break;
		}
		
		for(int i = 0 ; i < buyList.size() - 2 ; i++) {
			for(int j = i+1 ; j < buyList.size() - 1 ; j++) {
				if(buyList.get(i).equals(buyList.get(j))) {
					buyList.set(i, "");
				}
			}
		}
		
		for(int i = 0 ; i < buyList.size() ; i++) {
			if(!buyList.get(i).equals("")) {
				answer[0] = i + 1;
				break;
			}
		}
		
		answer[1] = buyList.size();
		
		for(int i : answer) {
			System.out.println(i);
		}
		
	}
}