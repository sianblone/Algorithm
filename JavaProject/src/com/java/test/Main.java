package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] arrStr = br.readLine().split(" ");
	    int a = Integer.valueOf(arrStr[0]);
	    int b = Integer.valueOf(arrStr[1]);
	    int v = Integer.valueOf(arrStr[2]);
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int v = sc.nextInt();
		
	    int count = 0;
	    
	    int c = v / (a-b);
	    System.out.println(c);
//	    sc.close();
	}
}