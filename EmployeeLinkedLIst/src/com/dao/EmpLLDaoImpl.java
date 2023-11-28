package com.dao;

import com.beans.Employee;

public class EmpLLDaoImpl implements EmpLLDao{
      Node head;
      class Node{
    	  Employee emp;
    	  Node next;
    	  public Node(Employee emp) {
    		  this.emp=emp;
    		  next=null;
    	  }
      }
      public EmpLLDaoImpl() {
    	  head=null;
      }
      public boolean isEmpty() {
    	  return head==null;
      }
	@Override
	public void AddAtEnd(Employee e) {
		//new node
		Node newnode=new Node(e);
		if(head==null) {
			head=newnode;
			System.out.println("Added successfully:");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			System.out.println("Added successfully:");
		}
	}
	@Override
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.emp);
			temp=temp.next;
		}
		
	}
	@Override
	public Employee deleteByValue(int id) {
		Employee e;
	 if(head.emp.getEmpid()==id) {
		 e=head.emp;
		 Node temp=head;
		 head=head.next;
		 temp.next=null;
		 return e;
	 }
	 Node prev=head;
	 Node current=head.next;
	 while(current!=null&&current.emp.getEmpid()!=id) {
		 prev=prev.next;
		 current=current.next;
	 }
	 if(current!=null) {
		 e=current.emp;
		 prev.next=current.next;
		 current.next=null;
		 current= null;
		 return e;
	 }else {
		 return null;
	 }
	 
	 
	}
	@Override
	public Employee Searchid(int id) {
		
		 Node temp=head;
		 while(temp!=null&&temp.emp.getEmpid()!=id) {
			 temp=temp.next;
		 }
		 if(temp!=null) {
			 return temp.emp;
		 }else {
			 return null;
		 }
	}
}
