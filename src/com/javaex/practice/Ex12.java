package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long gop = 1L;
		for(int i = x; i > 0;i--) {
			gop = gop * i;
		}
		System.out.println("결과값 :" + gop);
		sc.close();
		
		
		
		
	}
}
