package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� :");
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
		System.out.println("5�� ����� ���� : " + count + "\n5�� ����� �� : " + hap);
		
		sc.close();
	}
}
