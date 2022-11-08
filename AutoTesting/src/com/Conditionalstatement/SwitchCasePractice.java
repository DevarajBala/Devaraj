package com.Conditionalstatement;

import java.util.Scanner;

public class SwitchCasePractice {

	public static void main(String[] args) {
		Scanner ph= new Scanner(System.in);
		System.out.println("Enter the phone name:");
		String mobile = ph.nextLine();
		
        switch (mobile) {
        case "samsung":
            System.out.println("Buy a Samsung phone");
            break;
             
        case "iPhone":
            System.out.println("Buy an iPhone");
            break;
             
        case "Motorola":
            System.out.println("Buy a Motorola phone");
         
        }

	}

}
