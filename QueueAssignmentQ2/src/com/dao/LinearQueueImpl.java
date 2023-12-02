package com.dao;

import com.beans.Customer;

public class LinearQueueImpl implements LinearQueue {
    private Customer[] carr;
    private int size;
    private int front;
    private int rear;
    
    
    public LinearQueueImpl() {
		size=10;
		carr=new Customer[size];
    	front=-1;
    	rear=-1;
	}
	public LinearQueueImpl(int n) {
    	size=n;
    	carr=new Customer[size];
    	front=-1;
    	rear=-1;
    	
    }
	public boolean isEmpty() {
		return front==-1&&rear==-1;
	}
	@Override
	public void enqueue(Customer c) {
		if(front==-1) {
			front++;
			rear++;
			carr[rear]=c;
		}else {
			rear++;
			carr[rear]=c;
		}
		
	}
	@Override
	public Customer dequeue() {
		if(isEmpty()) {
			return null;
		}
		Customer c=carr[front];
		front++;
		return c;
	}
	@Override
	public void DisplayAllCustomer() {
		for(int i=front;i<=rear;i++) {
			System.out.println(carr[i]);
		}
		
	}
	

}
