package com.blz.VowelsOrConsanant;
import java.util.Scanner;
public class checkVowelsOrConsanant {

	public static void main(String[] args) {
	System.out.println("Welcome to check Alphabet is Vowels Or Cosanant Program!!");
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter any Alphabet:");
     char Alphabet = scan.next().charAt(0);
     
        switch(Alphabet) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	System.out.println(Alphabet+ " is a Vowel");
        	break;
        default:
        	System.out.println(Alphabet+ " is a Consanant");
        }
        	
            
     
	    	
	    }
	    	
	
	
	
	}


