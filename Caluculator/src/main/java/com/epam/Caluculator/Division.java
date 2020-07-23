package com.epam.Caluculator;

public class Division {
	double a,b;
	Division(double one,double two)
	{
		a=one;
		b=two;
	}
	boolean quo(double a,double b)
	{
	if(b!=0)
		{
		System.out.println(a/b);
		return true;
		}
	else 
		{
		System.out.println("Invalid operation");
		return false;
		}
	}

}
