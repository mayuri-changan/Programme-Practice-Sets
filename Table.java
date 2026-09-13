package com.demo.set3;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int num=sc.nextInt();
		int table=0;
		for(int i=0;i<=10;i++)
		{
			table=num*i;
			System.out.println(num+"*"+i+"="+table);
		}
		sc.close();
		

	}

}
