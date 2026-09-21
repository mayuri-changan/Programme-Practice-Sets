package com.demo.set6;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int s=sc.nextInt();
		
		int []ele=new int[s];
		System.out.println("enter elements");
		
		boolean found=false;
		for(int i=0;i<ele.length;i++)
		{
			ele[i]=sc.nextInt();
		}
		
		System.out.println("search element");
		int search=sc.nextInt();
		int pos=-1;
		int index=-1;
		for(int i=0;i<ele.length;i++) {
			if(ele[i]==search)
			{
				found=true;
				pos=i+1;
				index=i;
				break;
			}
		}
		if(found)
		{
			System.out.println("found ele"+"\nposition is:"+pos+"\nindex is :"+index);
		}
			else
			{
				System.out.println(" elem not found");
			}
		sc.close();
		}
		
		
		
				

	}



