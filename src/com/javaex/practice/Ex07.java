package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = 1;i <= x ; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
		sc.close();
		
		
		
		
	}

}
