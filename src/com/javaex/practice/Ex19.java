package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int mymoney = 0;
		while(flag) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� |4.����");
			System.out.println("--------------------------");
			
			System.out.print("����>");
			
			int select = sc.nextInt();
			
			
			switch (select) {
			case 1:
				System.out.print("���ݾ� >");
				int plusmoney = sc.nextInt();
				mymoney += plusmoney;
				break;
			case 2:
				System.out.print("��ݾ� >");
				int minusmoney = sc.nextInt();
				mymoney -= minusmoney;
				break;
			case 3:
				System.out.print("�ܰ�� >");
				System.out.print(mymoney);
				break;
			case 4:
				System.out.println("���α׷� ����");
				flag = false;
				break;

			default:
				System.out.println("�ٽ��Է����ּ���");
				break;
			}
			System.out.println("");
		}
		
		
		sc.close();
		
		
		
		
	}
}
