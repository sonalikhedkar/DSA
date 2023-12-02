package com.service;

import java.util.Scanner;

import com.beans.Customer;
import com.dao.LinearQueue;
import com.dao.LinearQueueImpl;

public class LinearQueueServiceImpl implements LinearQueueService{
    private LinearQueue dao;
    
    public  LinearQueueServiceImpl(){
    	dao=new LinearQueueImpl();
    }
	@Override
	public void AddNewCustomer() {
		Scanner sc=new Scanner(System.in);
		//private String name, mobile, email;
		  System.err.println("Enter customer id: ");
		  int id=sc.nextInt();
		  sc.nextLine();
		  System.out.println("Enter customer name: ");
		  String nm=sc.next();
		  System.out.println("Enter customer mobile no: ");
		  String mb=sc.next();
		  System.out.println("Enter customer email: ");
		  String email=sc.next();
		  Customer c=new Customer(id,nm,mb,email);
		 dao.enqueue(c);
	}
	@Override
	public Customer deleteCustomer() {
		return dao.dequeue();
	
	}
	@Override
	public void WaitingCustomerQueue() {
		dao.DisplayAllCustomer();
		
	}

}
