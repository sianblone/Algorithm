package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Escape {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] arrStr = br.readLine().split(" ");
	    int a = Integer.valueOf(arrStr[0]);
	    int b = Integer.valueOf(arrStr[1]);
	    int v = Integer.valueOf(arrStr[2]);
		
	    int c = 0;
	    if ((v-b) % (a-b) == 0) {
	    	c = (v-b) / (a-b);
	    } else {
	    	c = (v-b) / (a-b) + 1;
	    }
	    System.out.println(c);
	}
}