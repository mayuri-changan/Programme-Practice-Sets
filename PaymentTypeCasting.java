package com.demo.set5;
public class PaymentTypeCasting {
 static class Payment
{
	void getPay()
	{
		System.out.println("Payment is ready");
	}
	
}
static class Upi extends Payment
{
	void getPay()
	{
		System.out.println("payment through upi ");
	}
}
 static class Card extends Payment
{
	void getPay()
	{
		System.out.println("payment through card ");
	}
}
static class Cash extends Payment
{
	void getPay()
	{
		System.out.println("payment through cash ");
	}
}

public static void main(String[] args) {
	

	Upi u=new Upi();
	Card c=new Card();
	Cash ca=new Cash();
	
	Payment pay=u;
	pay.getPay();
	
	Payment paycash=ca;
	Cash ca1=(Cash)paycash;
	ca1.getPay();
	
	Payment payCard=c;
	Card card=(Card)payCard;
	card.getPay();
}
}
