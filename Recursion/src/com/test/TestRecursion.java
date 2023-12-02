package com.test;

import java.util.Scanner;

import com.services.RecursionService;

public class TestRecursion {

	public static void main(String[] args) {
		RecursionService rs=new RecursionService();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice: \n1:factorial of number\n2:addition of n natural number\n3:exit");
		   choice =sc.nextInt();
		   switch(choice) {
		   case 1:
			   System.out.println("enter number");
			   int num=sc.nextInt();
			  int fact= rs.CalculateFact(num);
			  if(fact==-1)
				  System.out.println("no factorial for negative numbers");
			  else
				  System.out.println("Factorial of number"+fact);
			   break;
		   case 2:
			   System.out.println("enter nth natural number: ");
			   num=sc.nextInt();
			   int sum=rs.sumOfNatural(num);
			   System.out.println("sumation is:"+sum);
			   break;
		   case 3:
			   break;
			   default:
				   System.out.println("enter correct choice");
		   }
		}while(choice!=3);

	}

}
