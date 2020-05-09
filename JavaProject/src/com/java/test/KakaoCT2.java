package com.java.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KakaoCT2 {
	
	public static void main(String[] args) throws IOException {
		String exp = "100-200*300-500+20";
		
		String[] arrStr1 = exp.split("[^0-9]");
		String[] arrStr2 = exp.replaceAll("[0-9]", "").split("");
		
		List<String> arrList1 = new ArrayList<>();
		List<String> arrList2 = new ArrayList<>();
		
		for(String s : arrStr1) {
			arrList1.add(s);
		}
		for(String s : arrStr2) {
			arrList2.add(s);
		}
		
		int[] sign = new int[3];
		for(int i = 0 ; i < arrStr2.length ; i++) {
			if(sign[0] + sign[1] + sign[2] == 3) break;
			if(arrStr2[i].equals("+")) sign[0] = 1;
			else if(arrStr2[i].equals("-")) sign[1] = 1;
			else if(arrStr2[i].equals("*")) sign[2] = 1;
		}
		
		int sum = sign[0] + sign[1] + sign[2];
		if(sum == 3) {
			for(int i = 0 ; i < sum ; i++) {
				minus(arrList1, arrList2);
				multiply(arrList1, arrList2);
				plus(arrList1, arrList2);
				
			}
		}
		
		
		System.out.println(Math.abs(Integer.valueOf(arrList1.get(0))));
	}
	
	public static void plus(List<String> arrList1, List<String> arrList2) {
		for(int i = 0 ; i < arrList2.size(); i++) {
			if(arrList2.get(i).equals("+")) {
				arrList1.set(i, Long.valueOf(arrList1.get(i)) + Long.valueOf(arrList1.get(i+1)) + "");
				arrList1.remove(i+1);
				arrList2.remove(i);
				i--;
			}
		}
	}
	
	public static void minus(List<String> arrList1, List<String> arrList2) {
		for(int i = 0 ; i < arrList2.size() ; i++) {
			if(arrList2.get(i).equals("-")) {
				arrList1.set(i, Long.valueOf(arrList1.get(i)) - Long.valueOf(arrList1.get(i+1)) + "");
				arrList1.remove(i+1);
				arrList2.remove(i);
				i--;
			}
		}
	}
	
	public static void multiply(List<String> arrList1, List<String> arrList2) {
		for(int i = 0 ; i < arrList2.size() ; i++) {
			if(arrList2.get(i).equals("*")) {
				arrList1.set(i, Long.valueOf(arrList1.get(i)) * Long.valueOf(arrList1.get(i+1)) + "");
				arrList1.remove(i+1);
				arrList2.remove(i);
				i--;
			}
		}
	}
}