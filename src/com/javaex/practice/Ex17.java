package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���ڸ� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
//		for(int i = x; i > 0 ; i--) {
//			
//			for(int j = i; j > 0 ;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		
		for(int i = 0; i <= x ; i++) {
			
			for(int j = x - i ; j > 0 ;j--) {
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
		sc.close();
	
	}
}
