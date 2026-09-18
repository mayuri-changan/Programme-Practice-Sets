package com.demo.set6;

import java.util.Scanner;

 
public class ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int []num=new int[n];
		int sum=0;
		System.out.println("enter elements");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			
		 sum=sum+num[i];
		
		}
		System.out.println(sum);
		sc.close();
		

	}

}
