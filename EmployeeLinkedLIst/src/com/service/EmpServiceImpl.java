package com.service;

import java.util.Scanner;

import com.beans.Employee;
import com.dao.EmpLLDao;
import com.dao.EmpLLDaoImpl;

public class EmpServiceImpl implements EmpService{
     EmpLLDao edao;
     public EmpServiceImpl() {
    	 edao=new EmpLLDaoImpl();
     }
	@Override
	public void AddEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		String nm=sc.next();
		System.out.println("Enter salary:");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,nm,sal);
		edao.AddAtEnd(e);
	}
	@Override
	public void DisplayAll() {
		edao.Display();
		
	}
	@Override
	public Employee DeleteById(int id) {
		return edao.deleteByValue(id);
	}
	@Override
	public Employee SearchByid(int id) {
		return edao.Searchid(id);
	}

	

}
