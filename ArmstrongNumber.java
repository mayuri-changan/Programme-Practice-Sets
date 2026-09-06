package com.demo.set3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int num=sc.nextInt();
		int sum=0;
		int original=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
			
		}
		System.out.println(sum);
		if(original==sum)
		{
		  System.out.println("amrstrong");	
		}
		else
		{
			System.out.println("not armstrong");	
		}
		
		sc.close();

	}

}
