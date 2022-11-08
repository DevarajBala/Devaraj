package com.Conditionalstatement;

import java.util.Scanner;

public class IfElseif {

	public static void main(String[] args) {
		Scanner mk = new Scanner (System.in);
		System.out.println("Enrer Your Name");
		String name = mk.nextLine();
		
		System.out.println("Enrer student degree");
		String deg = mk.nextLine();
		
		System.out.println("Enrer Maths mark");
		int  M1 = mk.nextInt();
		
		System.out.println("Enrer Science mark");
		int  M2 = mk.nextInt();
		
		System.out.println("Enrer English mark");
		int  M3 = mk.nextInt();
		
		int total = M1+M2+M3;
		float avg = total/3;
		
		System.out.println("Name:"+ name);
		System.out.println("Degree:"+ deg);
		System.out.println("Maths:"+ M1);
		System.out.println("Science:"+ M2);
		System.out.println("English:"+ M3);
		System.out.println("Total:"+ total);
		System.out.println("Avg:"+ avg);
		
		if(avg<=100 && avg >=85)
		{
			System.out.println("Grade A");
		}
		else if(avg<=84 && avg >=75)
		{
			System.out.println("Grade B");
		}
		else if(avg<=74 && avg >=65)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade C");
		}
	}

}
