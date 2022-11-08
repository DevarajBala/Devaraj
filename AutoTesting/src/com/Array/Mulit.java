package com.Array;

import java.util.Scanner;

public class Mulit {

	public static void main(String[] args) {

		{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrices. They must be equal.");
		n = input.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		
		System.out.println("Enter the numbers of the first matrix");
		for (int i = 0; i < n; i++)
		{
		for (int j = 0; j < n; j++)
		{
		a[i][j] = input.nextInt();
		}
		}
		
		System.out.println("Enter the numbers of the 2nd matrix");
		for (int z = 0; z < n; z++)
		{
		for (int k = 0; k < n; k++)
		{
		b[z][k] = input.nextInt();
		}
		}
		
		System.out.println("multiplication of matrices");
		for (int i = 0; i < n; i++)
		{
		for (int j = 0; j < n; j++)
		{
		for (int k = 0; k < n; k++)
		{
		c[i][j] = c[i][j] + a[i][k] * b[k][j];
		}
		}
		}
		
		System.out.println("The matrices is shown as below");
		for (int k = 0; k < n; k++)
		{
		for (int l = 0; l < n; l++)
		{
		System.out.print(c[k][l] + " ");
		}
		System.out.println();
		}
		input.close();
		}
		}

}


