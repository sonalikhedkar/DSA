package com.beans;

import com.beans.CircularSinglyLL.Node;

public class CircularDoublyLL {
    private Node head;
    class Node{
    	int data;
    	Node prev;
    	Node next;
    	public Node(int data) {
    		this.data=data;
    		prev=null;
    		next=null;
    	}
    	
    }
    public CircularDoublyLL() {
    	head=null;
    	
    }
    public void AddTheEnd(int data) {
    	Node newnode=new Node(data);
    	//list is empty
    	if(head==null) {
    		head=newnode;
    		newnode.next=head;
    		head.prev=newnode;
    	}else {
    		//list not empty
    		Node temp=head;
    		while(temp.next!=head) {
    			temp=temp.next;
    		}
    			newnode.next=head;
    			newnode.prev=temp;
    			temp.next=newnode;
    			head.prev=newnode;
    			
    		
    	}
    }
    public void AddAtPostion(int pos,int data) {
    	Node newnode=new Node(data);
    	//position 1
    	if(pos==1) {
    		// list empty
    		if(head==null) {
    			head=newnode;
        		newnode.next=head;
        		head.prev=newnode;
    		}
    		//list is not empty
    		Node temp=head;
    		while(temp.next!=head) {
    			temp=temp.next;
    		}
    		newnode.next=head;
    		newnode.prev=temp;
    		head.prev=newnode;
    		temp.next=newnode;
    		head=newnode;
    		
    	}else {
    		//position other than 1
    		//add in between or add at the end
			Node temp=head;
			int i;
			for(i=1;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
		     if(temp.next!=head) {
		    	newnode.next=temp.next;
		    	newnode.prev=temp;
		    	temp.next.prev=newnode;
		    	temp.next=newnode;
		    	 
		     }else {
		    	 //if temp.next is head then check is correct position or not
		    	 //temp node always before the position then only it is correct position  
		    		 if(pos-1==i) {
		    			 newnode.next=temp.next;
		 		    	newnode.prev=temp;
		 		    	temp.next.prev=newnode;
		 		    	temp.next=newnode;
		    	}else {
		    		System.out.println("Wrong position!NOt Added");
		    	 }
			
		}
    	}
    }
    public void deleteByValue(int value) {
    	if(head==null) {
    		System.out.println("List is empty");
    	}else {
    		Node current=head;
    		while(current.next!=head&&current.data!=value) {
    			current=current.next;
    		}
    		if(current.next==head&&current.data!=value) {
    			System.out.println("value not found");
    		}
    	//deletion at beginning
    	if(current==head) {
    		System.out.println("start");
    		Node last=head;
    		while(last.next!=head) {
    			last=last.next;
    		}
    		last.next=head.next;
    		head.next.prev=last;
    		head=current.next;
    		current.next=null;
    		current.prev=null;
    		
    	 }else {
    		 //between
    		if(current.next!=head) {
    			System.out.println("between");
    			current.prev.next=current.next;
    			current.next.prev=current.prev;
    			current.next=null;
    			current.prev=null;
    			current=null;
    		}else {
    			//last node
    			System.out.println("last");
    			current.prev.next=head;
    			head.prev=current.prev;
    			current.next=null;
    			current.prev=null;
    			current=null;
    		}
    	 }
    	}
    }
    public void PrintLL() {
    	Node temp=head;
    	
    	while(temp.next!=head) {
    		System.out.print(temp.data+",");
    		temp=temp.next;
    	}
    	System.out.print(temp.data);
    	System.out.println();
    }
}
