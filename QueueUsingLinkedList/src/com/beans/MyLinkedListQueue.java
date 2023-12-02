package com.beans;

public class MyLinkedListQueue {
   private Node front,rear;
   
   class Node{
	   int data;
	   Node next;
	   public Node(int data) {
		   this.data=data;
		   next=null;
	   }
   }
   public MyLinkedListQueue() {
	   front=null;
	   rear=null;
   }
   public boolean isFull() {
	   return front==null&& rear==null;
   }
   public void enqueue(int d) {
	   Node newnode=new Node(d);
	   if(front==null) {
		   front=newnode;
		   rear=newnode;
	   }else {
		   rear.next=newnode;
	   }
	   rear=newnode;
   }
   public int dequeue() {
	   Node temp=front;
	   front=front.next;
	   temp.next=null;
	   return temp.data;
   }
}
