package com.demo.set6;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int s=sc.nextInt();
		System.out.println("enter elements");
		int []ele=new int[s];
		for(int i=0;i<ele.length;i++ )
		{
			ele[i]=sc.nextInt();
		}
		System.out.print("reverse elements is:-");
		for(int j=ele.length-1;j>=0;j--)
		{
			System.out.print(ele[j]);
		}
		sc.close();

	}

}
