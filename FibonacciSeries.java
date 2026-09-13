package com.demo.set3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
				
		}
		
		
		sc.close();

	}

}
