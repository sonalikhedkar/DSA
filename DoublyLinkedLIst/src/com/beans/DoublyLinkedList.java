package com.beans;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
	}
	public DoublyLinkedList() {
		head=null;
		
	}
   public void AddAtEnd(int data) {
	   Node newnode=new Node(data);
	   if(head==null) {
		   head=newnode;   
	   }else {
		   Node temp=head;
		   while(temp.next!=null) {
			   temp=temp.next;
		   }
		   temp.next=newnode;
		   newnode.prev=temp;
	   }
   }
   public void AddGivenPostion(int data,int pos) {
	   Node newnode=new Node(data);
	   //if postion is 1 that is head postion
	   if(pos==1) {
		   newnode.next=head;
		   head.prev=newnode;
		   head=newnode;
		   
	   }
		  Node current=head;
		  for(int i=1;i<=pos-2&&current!=null;i++) {
			  current=current.next;
		  }
		  if(current!=null) {
			   newnode.next=current.next;
			   newnode.prev=current;
			   if(current.next!=null)
			        current.next.prev=newnode;
			   current.next=newnode;
		  }else {
			  System.out.println("Wrong postion!");
		  }
	   
   }
   public int deleteByValue(int value) {
	   Node current=head;
	   while(current!=null && current.data!=value ) {
		   current=current.next;
	   }
	   if(current!=null) {
		   if(current==head) {
			   Node temp=head;
			   head=temp.next;
			   head.prev=null;
			   temp.next=null;
			   return temp.data;
		   }else {
			   current.prev.next=current.next;
			   if(current.next!=null) {
				   current.next.prev=current.prev;
				   current.next=null;
			   }else {
				   current.prev=null;
				   current=null;
				   return current.data;
			   }
		   }
	   }
	   return -1;
   }
   public void displayList() {
	  Node temp=head;
	  System.out.print("[");
	   while(temp!=null) {
		   System.out.print(temp.data+" ");
		   temp=temp.next;
	   }
	  System.out.print("]");
	  System.out.println();
   }
   
}
