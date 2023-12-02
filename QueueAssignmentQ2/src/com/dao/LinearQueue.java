package com.dao;

import com.beans.Customer;

public interface LinearQueue {

	void enqueue(Customer c);

	Customer dequeue();

	void DisplayAllCustomer();

	

}
