package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("태어난 년도를 입력해 주세요\n년도: ");
		int year = sc.nextInt();
		int present = 2023;
		System.out.println("올해: 2023");
		System.out.println("태어난 해: " + year);
		int age = present - year;
		System.out.println("나이: " + age);
		System.out.println("====================================");
		
		if (age < 20) {
			System.out.println("20살 미만 건강검진 대상이 아님.");
		}else if ((age >= 20) && ((year % 2) == 1) && (age < 40)){
			System.out.print("20살이상\n건강검진의해\n암 검사X");
		}else if ((age >= 20) && ((year % 2) == 0) && (age < 40)){
			System.out.print("20살이상\n건강검진의해 아님");
		}else if (((year % 2) == 0) && (age >= 40)) {
			System.out.print("20살이상\n건강검진의해 아님");
		}else if (((year % 2) == 1) && (age >= 40)) {
			System.out.print("20살이상\n건강검진의해\n암 검사");
		}
	}

}
