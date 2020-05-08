package com.java.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KakaoCrane {
	
	public static void main(String[] args) throws IOException {
		
		// 위에서부터 가로줄 1~5
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		List<Integer> dollList = new ArrayList<>();
		int index = -1;
		int removedDoll = 0;
		
		// moves 개수만큼 뽑기
		for(int i = 0 ; i < moves.length ; i++) {
			// 0,0 / 1,0 / 2,0 ... 순서대로 첫 번째 인형 있는지 확인 후 뽑기
			for(int j = 0 ; j < board.length ; j++) {
				int a = board[j][moves[i]-1];
				// 인형이 없으면(0이면) 반복문 다음으로
				if (a == 0) continue;
				// 인형이 있으면 리스트에 추가하고, 뽑은 인형 값 0으로 만들고, 리스트 검색할 index 증가시키고 반복문 끝내기
				dollList.add(a);
				board[j][moves[i]-1] = 0;
				index++;
				break;
			}
			
			System.out.println(moves[i] + "인형 상태 : " + dollList.toString() + "/ index : " + index);
			// 인형리스트의 크기가 2 이상일 때
			// 리스트 현재 값과 이전 값을 비교하여 같은 번호면 인형 2개 지우기
			if(dollList.size() > 1) {
				if(dollList.get(index) == dollList.get(index-1)) {
					dollList.remove(index);
					dollList.remove(index-1);
					index -= 2;
					removedDoll += 2;
				}
			}
			System.out.println(moves[i] + "인형 없어짐 체크 후 상태 : " + dollList.toString() + "/ index : " + index);
		}
		System.out.println("사라진 인형 갯수 : " + removedDoll);
	}
}