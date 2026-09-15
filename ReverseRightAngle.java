package com.demo.set4;

import java.util.Scanner;

public class ReverseRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		System.out.println("enter any num you want to write");
		for(int i=1;i<=5;i++)
		{
			{
				for(int s=1;s<=5-i;s--)
				{
					System.out.print(" ");
					
				}
				for(int star=1;star<=i;star++)
				System.out.println("*");
				
			}
			System.out.println();
			sc.close();
		}

	}




	}


