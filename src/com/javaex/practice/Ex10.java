package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int top = x;
		
		for(int i = 0 ; i < 4; i++) {
			x = sc.nextInt();
			
			if(x > top) {
				top = x;
			}
		}
		System.out.println("�ִ밪�� " + top + "�Դϴ�.");
		sc.close();
		
	}
}
