package com.java.learn;

public class A1_getMonth {
	
	public static void main(String[] args) {
		
		String monthName1 = getMonthName1(10);
		String monthName2 = getMonthName2(10);
		
		System.out.println(monthName1);
		System.out.println(monthName2);
		
	}
	
	// 알고리즘 초보 실수 : 코드의 논리와 상관없는 데이터를 한번에 같이 사용
	public static String getMonthName1(int month) {
		String monthName = "";
		if(month == 1) monthName = "January";
		else if(month == 2) monthName = "February";
		else if(month == 3) monthName = "March";
		else if(month == 4) monthName = "April";
		else if(month == 5) monthName = "May";
		else if(month == 6) monthName = "June";
		else if(month == 7) monthName = "July";
		else if(month == 8) monthName = "August";
		else if(month == 9) monthName = "September";
		else if(month == 10) monthName = "October";
		else if(month == 11) monthName = "November";
		else if(month == 12) monthName = "December";
		
		return monthName;
	}
	
	// 논리와 상관없는 데이터(상수)는 가능한 분리한 코드 : 양도 줄어들고 실수도 줄어듬
	public static String getMonthName2(int month) {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		return monthNames[month];		
	}

}
