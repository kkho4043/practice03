package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = x; i > 0 ; i--) {
			for(int j = i; j > 0 ;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = 2; i <= x ; i++) {
			for(int j = i; j > 0 ;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
