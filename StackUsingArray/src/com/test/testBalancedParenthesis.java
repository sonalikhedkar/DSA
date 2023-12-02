package com.test;

import java.util.Scanner;

import com.beans.MyStringStack;

public class testBalancedParenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str="(())]";
		System.out.println("enter string: ");
		String str=sc.next();
		boolean status= checkBalancedparenthesis(str);
		if(status) {
			System.out.println("balancedparenthesis");
		}else {
			System.out.println("not balanced");
		}

	}

	private static boolean  checkBalancedparenthesis(String str) {
		MyStringStack ob=new MyStringStack(str.length());
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				ob.push(ch);
			}else {
			if(ch==')'||ch=='}'||ch==']') {
				if(!ob.isEmpty()) {
				char ch1=ob.pop();
				if(ch==')'&&ch1!='(' || ch=='}'&&ch1!='{'||ch=='['&&ch1!=']') {
					return false;
				}
				}else 
					return false;
				
				}
			}
		}
		if(ob.isEmpty()) {
			return true;
		}
		return false;
		
	}

}
