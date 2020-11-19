package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		
		for(int i = x;i >= 0;i-=2) {
			sum +=i;
		}
		
		System.out.println("결과값 : " + sum);
		sc.close();
		
		
		
		
	}

}
