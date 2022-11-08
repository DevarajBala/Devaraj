package com.Conditionalstatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sw=new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter the option");
		
		char option = sw.next().charAt(0);
		switch(option) {
		
		case'1':
			System.out.println("Enter the first value:");
			int n1 = sw.nextInt();
			
			System.out.println("Enter the scond Value:");
			int n2 = sw.nextInt();
			
			int n3=n1+n2;
			System.out.println("Addition of two number:"+ n3);
			break;
			
		case '2':
			System.out.println("Enter the first valu:");
			int x = sw.nextInt();
			
			System.out.println("Enter the second valu:");
			int y = sw.nextInt();
			
			int Z = x-y;
			System.out.println("Subtraction of two number"+ Z);
			break;
			
			default:
				System.out.println("Enter a valide number");
			break;
		}
	}

}
