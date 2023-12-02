package com.beans;

public class SingleLL {
	class Node{
		int n;
		Node next;
		public Node(int n) {
			this.n=n;
			next=null;
		}
	}
	private Node head;
	public SingleLL() {
		head=null;
	}
	//method to add node at start
	public void addStart(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;	
		}else {
			newnode.next=head;
			head=newnode;
		} 
		
	}
	
	 public boolean search(int n) {
	    	Node temp=head;
	    	while(temp!=null) {
	    		
	    		if(n==temp.n)
	    			return true;
	    		temp=temp.next;
	    	}
	    	return false;
	    }
	    public void removeByKey(int key) {
	    	//remove the node with value key
	    	Node prev=null;
	    	Node current=head;
	    	while(current!=null&&current.n!=key) {
	    		prev=current;
	    		current=current.next;
	    	}
	    	
	    	if(current!=null) {
	    		//if key find at head
	    		if(current==head) {
	    			head=current.next;
	    			current.next=null;
	    		}else {
	    			prev.next=current.next;
	    			current.next=null;
	    			current=null;
	    		}
	    	}else {
	    		System.out.println("Not present!");
	    	}
	    }
	    
	    public void displaydata() {
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.print(temp.n+",");
	    		temp=temp.next;
	    	}
	    	System.out.println();
	    }

}
