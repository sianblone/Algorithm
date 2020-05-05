package com.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DeliverySugar {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int amount = Integer.valueOf(br.readLine());
		int remainder = amount % 5;
		int result = 0;
		
		if(amount == 4 && amount == 7) result = -1;
		else if(remainder == 0) result = amount / 5;
		else if(remainder == 1 || remainder == 3) result = amount / 5 + 1;
		else if(remainder == 2 || remainder == 4) result = amount / 5 + 2;
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

}
