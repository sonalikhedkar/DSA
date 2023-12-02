package com.service;

import com.beans.Customer;

public interface LinearQueueService {

	void AddNewCustomer();

	Customer deleteCustomer();

	void WaitingCustomerQueue();

}
