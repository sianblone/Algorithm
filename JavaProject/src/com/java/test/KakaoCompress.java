package com.java.test;

import java.io.IOException;

public class KakaoCompress {
	
	public static void main(String[] args) throws IOException {
		String s = "xababcdcdababcdcd";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		int answer = 1001;
		// 나눌 단위
		for(int unit = 1 ; unit <= s.length() / 2 ; unit++) {
			int index = 0;
			int count = 1;
			for(int i = 0 ; i <= s.length() / unit ; i++) {
				
			}
		}
		return answer;
	}
}