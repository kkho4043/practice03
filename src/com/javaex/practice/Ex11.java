package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= x;i+=2) {
			if(x % 2 == 0 && i % 2 != 0) {
				i++;
			}
			sum = sum + i;
		}
		
		System.out.println("����� : " + sum);
		sc.close();
		
		
		
		
	}

}
