package com.test;

import java.util.Scanner;

import com.beans.MyStringStack;

public class TestReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyStringStack ob=new MyStringStack();
		System.out.println("Enter string :");
        String str=sc.next();//
        System.out.println("Entered String: "+str);
        for(int i=0;i<str.length();i++) {
        	ob.push(str.charAt(i));
        }
        String str2="";
        while(!ob.isEmpty()) {
        	char ch=ob.pop();
        	str2=str2+ch;
        }
        System.out.println("Reverse String: "+str2);
        if(str.equals(str2)) {
    		System.out.println("String is pallindrome");
    	}else {
    		System.out.println("String is not pallindrome");
    	}
	}
	

}
