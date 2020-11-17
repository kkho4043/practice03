package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		char ch;
		
		boolean ingameflag = true;
		boolean gameflag = true;
		
		while(gameflag) {
			
			System.out.println("================================");
			System.out.println("\t[숫자맞추기게임 시작]");
			System.out.println("================================");
			int num =  (int)(Math.random()*100)+0;
			
			while (ingameflag) {
				System.out.print(">>");
				x = sc.nextInt();
				if(x > num) {
					System.out.println("더 낮게");
				}else if(x < num) {
					System.out.println("더 높게");
				}else {
					System.out.print("맞았습니다.");
					ingameflag = false;
				}
				
			}
			
			System.out.print("게임을 종료하시겠습니까? (y / n) >>");
			ch = sc.next().charAt(0);
			
			 if(ch =='y'||ch == 'Y') {
				 gameflag = false;
				 System.out.println("================================");
					System.out.println("\t[숫자맞추기게임 종료]");
					System.out.println("================================");
			 }else {
				 System.out.println("다시 시작합니다.");
				 ingameflag = true;
			 }
		}
		sc.close();
	}

}
