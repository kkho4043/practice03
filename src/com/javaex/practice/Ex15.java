package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 1;i <= x; i++) {
			if(x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
