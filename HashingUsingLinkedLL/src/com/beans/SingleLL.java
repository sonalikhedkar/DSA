package com.beans;

public class SingleLL {
       class Node{
    	   int data;
    	   Node next;
    	   public Node(int data) {
    		   this.data=data;
    		   next=null;
    	   }
       }
       private Node head;
       public SingleLL() {
    	   head=null;
       }
       public void addAtStart(int val) {
    	   //create new node
    	   Node newnode=new Node(val);
    	   if(head==null) {
    		   head=newnode;
    		 }else {
    			 newnode.next=head;
    			 head=newnode;
    		 }
       }
       //method to search data into linked list
       public boolean search(int n) {
    	   Node current=head;
    	   while(current!=null) {
    		   if(current.data==n) {
    			   return true;
    		   }
    		   current=current.next;
    	   }
    	   return false;
       }
       public void display() {
    	   Node temp=head;
    	   while(temp!=null) {
    		   System.out.print(temp.data+",");
    		   temp=temp.next;
    	   }
    	   System.out.println();
       }
}
