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
			System.out.println("\t[���ڸ��߱���� ����]");
			System.out.println("================================");
			int num =  (int)(Math.random()*100)+0;
			System.out.println("���� -->"+num);
			while (ingameflag) {
				System.out.print(">>");
				x = sc.nextInt();
				if(x > num) {
					System.out.println("�� ����");
				}else if(x < num) {
					System.out.println("�� ����");
				}else {
					System.out.print("�¾ҽ��ϴ�.");
					ingameflag = false;
				}
				
			}
			
			System.out.print("������ �����Ͻðڽ��ϱ�? (y / n) >>");
			ch = sc.next().charAt(0);
			
			 if(ch =='y'||ch == 'Y') {
				 gameflag = false;
				 System.out.println("================================");
					System.out.println("\t[���ڸ��߱���� ����]");
					System.out.println("================================");
			 }else {
				 System.out.println("�ٽ� �����մϴ�.");
				 ingameflag = true;
			 }
		}
		sc.close();
	}

}
