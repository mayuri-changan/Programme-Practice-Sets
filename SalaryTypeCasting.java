package com.demo.set5;

public class SalaryTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal=999.99;
		int salary=(int)sal;
		System.out.println(salary);
		System.out.println(sal);
		double d=Math.round((sal-salary)*100.0)/100.0;
		System.out.println(d);

	}

}
