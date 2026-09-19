package com.demo.set6;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size");
		int s=sc.nextInt();
		System.out.println("enter elements");
		int []ele=new int [s];
		for(int i=0;i<ele.length;i++)
		{
			ele[i]=sc.nextInt();
		}
		for(int i=0;i<ele.length;i++)
		{
			for(int j=0;j<ele.length;j++)
			{
				if(ele[i]==ele[j])
				{
					System.out.println(ele[i]);
				}
				
			}
			
		}
		sc.close();
	}
}

		

