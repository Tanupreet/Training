package com.tanu;

import java.util.ArrayList;
import java.util.List;

public class Account {
	int a;
	int b;
	Account(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	static int sum(int a, int b)
	{
		return a+b;
	}
}

class LoanAcc extends Account
{
	
}
class Loan extends LoanAcc
{
	
public static void main(String args[])
{
	//Account acc=new Account();
List<?super LoanAcc> acc=new ArrayList<LoanAcc>();	
acc.put(Account(10,20));
 System.out.println(Account.sum(10,20));
}
}
