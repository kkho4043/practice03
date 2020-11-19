package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
			System.out.print(i);
			
			if(i < x) {
				 System.out.print("+");
			}
			
			
		}
		
		System.out.println("\n합계 : " + sum);
	}
}
