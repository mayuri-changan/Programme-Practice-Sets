package com.demo.set3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
		sc.close();
		
				;

	}

}
