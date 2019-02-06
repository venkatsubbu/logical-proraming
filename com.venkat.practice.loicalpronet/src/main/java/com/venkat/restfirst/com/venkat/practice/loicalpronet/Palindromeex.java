package com.venkat.restfirst.com.venkat.practice.loicalpronet;

import java.util.Scanner;

public class Palindromeex {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the string u want to reverse:");
		String st=sc.next();
		String rev="";
		for(int i=st.length()-1; i>=0; i--){
		rev=rev+st.charAt(i);
		}
		if(st.equals(rev)) {
			System.out.println("palindrome:"+rev);
		}
		else {
				System.out.println("not palindrome"+rev);
			}
		
		*/
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter te strin u want to reverse:");
	String st=sc.next();
	String rev="";
	for(int i=st.length()-1;i>=0;i--) {
	rev=rev+st.charAt(i);
	}
	if(st.equals(rev)) {
		System.out.println("palindrome:"+rev);
	}
	else {
		System.out.println("not a palindrome:"+rev);
	}
		
		
		
		
		
		
		
		
		
	
	}
}

























