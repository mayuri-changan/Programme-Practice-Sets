package com.demo.set3;

import java.util.Scanner;

public class AlphabetDigitSpecialCharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>='0'&& ch<='9')
		{
			System.out.println("Digit");
			
		}
		else
		{
			System.out.println("special character");
		}
		
		sc.close();

	}

}
