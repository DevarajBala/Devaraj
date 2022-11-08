package com.Conditionalstatement;

import java.util.Scanner;

public class ElseIfstatement {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner S = new Scanner(System.in);
		int time = S.nextInt();
	
	    if (time < 10) {
	      System.out.println("Good morning.");
	    } else if (time < 20) {
	      System.out.println("Good day.");
	    }  else {
	      System.out.println("Good evening.");
	    }

	}

}
