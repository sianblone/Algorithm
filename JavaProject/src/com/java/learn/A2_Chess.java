package com.java.learn;

public class A2_Chess {
	
	public static void main(String[] args) {
		int[] relativeXY = getChessKnight(3);
		
		for(int xy : relativeXY) {
			System.out.println(xy);
		}
	}
	
	// 체스의 나이트가 움직일 수 있는 상대 좌표 : 말이 움직일 수 있는 위치를 작성하는 것보다 상대좌표를 배열에 저장해두고 사용하기
	public static int[] getChessKnight(int caseNum) {
		// 나이트가 움직일 수 있는 좌표는 총 8가지(팔각형의 꼭지점)
		int[] knightDx = { 2, 2, -2, -2, 1, 1, -1, -1 };
		int[] knightDy = { 1, -1, 1, -1, 2, -2, 2, -2 };
		
		int[] relativeXY = { knightDx[caseNum], knightDy[caseNum] };
		
		return relativeXY;
	}
}
