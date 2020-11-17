package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int count = 0;
		int hap = 0;
		
		for(int i = 1 ; i <= x; i++) {
			if(i % 5 == 0) {
				count++;
				hap += i;
			}
		}
		System.out.println("5의 배수의 개수 : " + count + "\n5의 배수의 합 : " + hap);
		
		sc.close();
	}
}
