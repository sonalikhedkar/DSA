package com.beans;

public class CircularSinglyLL {
	private Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public CircularSinglyLL() {
		head=null;
	}
	//method to add node at the given position 
	public void AddByPostion(int pos,int data) {
		//first create new node
		Node newnode=new Node(data);
		//if List is empty 
		if(head==null) {
			head=newnode;
			//because it is circular last node must point to head
			newnode.next=head;
		}else {
			//when LinkedList is not empty
			//add at the beginning
			if(pos==1) {
				newnode.next=head;
				//traverse head to last node and last node next must point to new node
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=newnode;
				newnode=head;
//				newnode.next=head;
//				head=newnode;
//				temp.next=head;
			}else {
				//add in between or add at the end
				Node temp=head;
				int i;
				for(i=1;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
			     if(temp.next!=head) {
			    	newnode.next=temp.next;
					temp.next=newnode;
			    	 
			     }else {
			    	 //if temp.next is head then check is correct position or not
			    	 //temp node always before the position then only it is correct position  
			    		 if(pos-1==i) {
			    			 newnode.next=temp.next;
			    			 temp.next=newnode;
			    	}else {
			    		System.out.println("Wrong position!NOt Added");
			    	 }
				
			}
			
			}
		}
   
		
	}
	public void deleteByKey(int n) {
		//list is empty
		if(head==null) {
			System.out.println("List is empty!");
		}
		Node prev=null;
		Node current=head;
		while(current.data!=n&&current.next!=head) {
			prev=current;
			current=current.next;
		}
		//delete at the beginning
		
		if(current==head) {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=current.next;
			head=head.next;
			current.next=null;
			current=null;
		 
		}else {
			//delete in between the list
			prev.next=current.next;
			current.next=null;
			current=null;
			
		}
	}
	public void DisplayList() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		//to display last node value
		System.out.println(temp.data);
	}

}
