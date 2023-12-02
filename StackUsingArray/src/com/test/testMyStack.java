package com.test;

import java.util.Scanner;

import com.beans.MyStack;

public class testMyStack {

	public static void main(String[] args) {
		MyStack ob=new MyStack(20);
		
		ob.push(34);
		ob.push(56);
		ob.push(32);
		ob.push(90);
		System.out.println(ob.pop());
		//ob.pop();
		ob.push(100);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		ob.push(num);
		System.out.println("last stack");
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}
		ob.push(90);
		ob.pop();
	}

}
