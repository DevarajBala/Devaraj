package com.Loops;

public class NestedPyramid {

	public static void main(String[] args) {
		
		System.out.println("Star Pyramid");
		drawStarPatten();
		System.out.println("Star Numbers");
		drawNumberPatten();
	}
	
	public static void drawStarPatten() {
		for(int i=0 ;i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k= 0; k<= i; k++)	{
				System.out.print("* ");
				
			}	
				System.out.println();	
			}	
	}
	
	public static void drawNumberPatten() {
		for(int i=0; i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(k+" ");
			}
				System.out.println();
		}
	}
		
}
