package com.beans;

public class MyLinkedListStack {
  private Node top;
 
  class Node{
	  int data;
	  Node next;
	  public Node(int data) {
		  this.data=data;
		  next=null;
	  }
  }
   public MyLinkedListStack() {
	   top=null;
   }
   //if head is null then stack is null
   public boolean isEmpty() {
	   return top==null;
   }
   //add node into stack
   public void push(int data) {
	   //create first node
	   Node newnode= new Node(data);
	   
	   newnode.next=top;
	   top=newnode;
	   
   }
   
   public int pop() {
	   if(isEmpty()) {
		   System.out.println("Stack underflow");
		   return -1;
	   }
	   int d=top.data;
	   Node temp=top;
	   top=top.next;
	   temp.next=null;
	   return d;
   }
}
