package com.demo.set6;

import java.util.Scanner;

public class StringArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of string");
		int s=sc.nextInt();
		
		String []str=new String[s];
		System.out.println("enter string names");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
			
			
		}
		
		sc.close();

	}

}
