package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
		}
		
		System.out.println("�հ� : " + sum);
		
	}
}
