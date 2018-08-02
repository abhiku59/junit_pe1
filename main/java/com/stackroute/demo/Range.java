
	package com.stackroute.demo;
	import java.util.Scanner;
	public class Range {
	    
	    public String func(int num)
	    {
	        if (num%2!=0 && num>=20 && num<=30)
	        {
	            return("Tom");
	        }
	        else if (num%2==0 && num>=20 && num<=30)
	        {
	            return("Jerry");
	        }
	        else
	                return("condition not satisfied");
	        }
	    public static void main(String[] args)
	    {
	    System.out.println("enter number ");
	    Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt();
	    Range obj = new Range();
	    System.out.print(obj.func(num));
	    }
	}

