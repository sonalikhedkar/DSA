package com.service;

import com.beans.Employee;

public interface EmpService {

	void AddEmployee();

	void DisplayAll();

	Employee DeleteById(int id);

	Employee SearchByid(int id);

}
