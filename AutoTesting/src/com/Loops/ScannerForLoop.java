package com.Loops;

import java.util.Scanner;

public class ScannerForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Message");
		String mes = sc.nextLine();
		System.out.println("How many time message need to print");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(mes);
		}
		
	}

}
