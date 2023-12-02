package com.test;

import java.util.Scanner;

import com.beans.Customer;
import com.service.LinearQueueService;
import com.service.LinearQueueServiceImpl;

public class TestLinearQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LinearQueueService service=new LinearQueueServiceImpl();
		int choice;
		do {
			System.out.println("Enter your choice!");
			System.err.println("1. add new customer\n2. delete customer from queue\n3.display waiting list\n4. exit");
		    choice=sc.nextInt();
		    switch(choice) {
		    case 1:
		    	service.AddNewCustomer();
		    	break;
		    case 2:
		    	Customer c=service.deleteCustomer();
		    	if(c!=null) {
		    		System.out.println(c);
		    	}else {
		    		System.out.println("NO customer in Queue!");
		    	}
		    	break;
		    	
		    case 3:
		    	service.WaitingCustomerQueue();
		    	break;
		    case 4:
		    	sc.close();
		    	System.err.println("Thank You for visiting...");
		    	break;
		    	default:
		    		System.err.println("wrong choice!");
		    }

	}while(choice!=4);
	}
}
