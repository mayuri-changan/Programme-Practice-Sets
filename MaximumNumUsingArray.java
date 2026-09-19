package com.demo.set6;

import java.util.Scanner;

public class MaximumNumUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int s=sc.nextInt();
		System.out.println("enter elements");
		int []element=new int[s];
		
		for(int i=0;i<element.length;i++)
		{
			element[i]=sc.nextInt();
			
		}
		int max=element[0];
		for(int i=0;i<element.length;i++)
		{
			if(element[i]>max)

		{
				max=element[i];
		}
			
		}
		System.out.println("maximum number is:-"+max);
			
		
			
		sc.close();

	}

}
