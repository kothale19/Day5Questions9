package com.blz.VowelsOrConsanant;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Largest Number Program!!");
		
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the First Number:");
	          int a = scan.nextInt();
	        System.out.println("Enter the Second Number:");
	          int b = scan.nextInt();
	        System.out.println("Enter the Third Number:");
	          int c = scan.nextInt();
	          
	          if (a>b && a>c)
	          System.out.println("Largest Number is: "+a);
	          else if (b>a && b>c)
	           System.out.println("Largest Number is: "+b);
	          else
	        	  System.out.println("Largest Number is: "+c);
	        	   
	        	   
	          
	          
	          
	          
	          
		}
	}


