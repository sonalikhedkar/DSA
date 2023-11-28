package com.dao;

import com.beans.Employee;

public interface EmpLLDao {

	void AddAtEnd(Employee e);

	void Display();

	Employee deleteByValue(int id);

	Employee Searchid(int id);


}
