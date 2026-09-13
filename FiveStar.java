package com.demo.set4;

import java.util.Scanner;

public class FiveStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		System.out.println("enter any num you want to write");
		for(int i=1;i<=5;i++)
		{
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
				
			}
			sc.close();
			
		}

	}

}
