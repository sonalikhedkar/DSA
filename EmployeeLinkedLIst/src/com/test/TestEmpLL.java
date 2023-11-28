package com.test;

import java.util.Scanner;

import com.beans.Employee;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class TestEmpLL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpService eservice=new EmpServiceImpl();
		int ch;
		do {
		System.out.println("Enter your choice: ");
		System.out.println("1:Add New Employee\n2:Delete By id\n3:Search by id\n4:Display All\n5:exit ");
		 ch=sc.nextInt();
		 switch(ch) {
		 case 1:
			 eservice.AddEmployee();
			 break;
		 case 2:
			 System.out.println("Enter id: ");
			 int id=sc.nextInt();
			Employee e= eservice.DeleteById(id);
			if(e!=null) {
				System.out.println("Deleted Successfully!");
			}else {
				System.out.println("id not found!");
			}
			 break;
		 case 3:
			 System.out.println("Enter id: ");
			 id=sc.nextInt();
			 e=eservice.SearchByid(id);
			 if(e!=null) {
			 System.out.println(e);
			 }else {
				 System.out.println("id not found!");
			 }
			 break;
		 case 4:
			 eservice.DisplayAll();
			 break;
		 case 5:
			 sc.close();
			 System.out.println("Thank you....");
			 default:
				 System.out.println("wrong choice");
		 }
		}while(ch!=5);
	}

}
