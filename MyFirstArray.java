package com.demo.set6;

public class MyFirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,6,7,8,8,9};
		for(int i=1;i<=9;i++)
		{
			for(int j=i+1;j<=9;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
				
			}
			
		}

	}

}
