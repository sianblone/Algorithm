package com.java.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Calendar1 {
	
	public static void main(String[] args) {
		
		// 1. LocalDate 클래스(자바 8 이상)
		LocalDate ld = LocalDate.now();
		
		// 1일로 설정(이번 달 첫 번째 날짜의 요일 찾기)
		LocalDate firstDayOfMonth = ld.withDayOfMonth(1);
		// 이번 달 마지막 날짜로 설정
		LocalDate lastDayOfMonth = ld.with(TemporalAdjusters.lastDayOfMonth());
		
		// 요일(enum)
		DayOfWeek dayOfWeek_firstDayOfMonth_1 = firstDayOfMonth.getDayOfWeek();
		// 요일 : 1(월요일) ~ 7(일요일)
		int dayOfWeek_firstDayOfMonth_1_value = dayOfWeek_firstDayOfMonth_1.getValue();
		// 이번 달 마지막 날짜
		int lastDayOfMonth_1 = lastDayOfMonth.getDayOfMonth();
		
		System.out.println("LocalDate dayOfWeek_firstDayOfMonth : " + dayOfWeek_firstDayOfMonth_1);
		System.out.println("LocalDate dayOfWeek_firstDayOfMonth_value : " + dayOfWeek_firstDayOfMonth_1_value);
		System.out.println("LocalDate lastDayOfMonth : " + lastDayOfMonth_1);
		
		// -------------------------------------------------------------------------
		
		// 2. Calendar 클래스
		Calendar cal = Calendar.getInstance();
		
		// 1일로 설정(이번 달 첫 번째 날짜의 요일 찾기)
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		// 요일 : 1(일요일) ~ 7(토요일)
		int dayOfWeek_firstDayOfMonth_2 = cal.get(Calendar.DAY_OF_WEEK);
		// 이번 달 마지막 날짜 
		int lastDayOfMonth_2 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("Calender dayOfWeek_firstDayOfMonth : " + dayOfWeek_firstDayOfMonth_2);
		System.out.println("Calender lastDayOfMonth : " + lastDayOfMonth_2);
		
	}

}
