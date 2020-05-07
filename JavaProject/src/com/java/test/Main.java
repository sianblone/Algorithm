package com.java.test;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String s = "xababcdcdababcdcd";
		solution(s);
	}
	
	public static int solution(String s) {
		int answer = Integer.MAX_VALUE;
		// 나눌 단위
		for(int leng = 1 ; leng <= s.length() / 2 ; leng++) {
			String word = "";
			String compress = "";
			int count = 1;
			String divide = "";
			// 기준 단어
			for(int i = 0 ; i < leng ; i++) {
				divide += s.charAt(i);
			}
			
			// 새로운 인덱스
			for(int i = 0 ; i < s.length() ; i += leng) {
				word = "";
				// 나눌 단어
				for(int j = i ; j < i + leng ; j++) {
					if(j >= s.length()) break;//마지막 나눌 단어의 길이가 나눌 단위보다 적을 경우
					word += s.charAt(j);
				}
				
				// 기준 단어와 나눌 단어가 같으면 단어 압축 카운트 증가
				if(divide.equals(word)) {
					count++;
				} else {
					// 기준 단어와 나눌 단어가 다르면 압축 카운트 + 기준 단어
					if(count > 1) {
						compress += count + divide;
						count = 1;
					} else {
						// 압축 카운트가 1이면 +기준 단어만
						compress += divide;
					}
					// 기준 단어 새로운 단어로 바꿔주기
					divide = word;
				}
			}
			
			// 마지막엔 count++만 했으므로
			if(count > 1) {
				compress += count + divide;
				count = 1;
			} else {
				compress += divide;
			}
			
			int length = compress.length();
			answer = answer > length ? length : answer;
		}
		
		if(answer == Integer.MAX_VALUE) answer = 1;
		
		return answer;
	}
}