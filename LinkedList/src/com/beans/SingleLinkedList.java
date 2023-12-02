package com.beans;

public class SingleLinkedList {
	private Node head;
	
    class Node{
	   int data;
	   Node next;
	   public Node(int data) {
		   this.data=data;
		   next=null;
	   }
	   
   }
    public SingleLinkedList() {
		   head=null;
	   }
    //add at the end of linked list
    public void addEndofList(int data) {
    	//create node
    	 Node newnode=new Node(data);
    	 if(head==null) {
    		 head=newnode;
    	 }else {//current node is initially on head
    		 Node current=head;
    		 while(current.next!=null) {
    			 current=current.next;
    		 }
    		 current.next=newnode;
    	 }
    }
    //add at position
    public void addAtPosition(int data,int pos) {
    	//create new node
    	Node newnode=new Node(data);
    	if(head==null&&pos!=1) {
    		System.out.println("List is empty");
    	}else {
    		if(pos==1) {
    			if(head==null) {
    				head=newnode;
    			}else {
    				//head.next=null and head!=null
    				newnode.next=head;
    				head=newnode;
    			}
    		}else {
    			Node prev=head;
    			for(int i=1;prev!=null && i<=pos-2;i++) {
    				prev=prev.next;
    			}
    			if(prev!=null) {
    				newnode.next=prev.next;
    				prev.next=newnode;
    			}else {
    				System.out.println("position is wrong!");
    			}
    			
    		}
    	}
    }
    ///delete node by value
    public boolean deleteNodeByValue(int value) {
    	if(head==null) {
    		System.out.println("LinkedList is empty");
    	}else {
    		//head is not null
    		if(head.data==value) {
    			Node temp=head;
    			head=head.next;
    			temp.next=null;
    			return true;
    		}else {
    			//head.data is not equal to value
    			Node prev=head;
    			Node current=head.next;
    			while(current!=null&&current.data!=value) {
    				prev=prev.next;
    				current=current.next;
    			}
    			//while loop end if current is null or
    			//current node data matches to given value that current is not null
    			if(current!=null) {
    				prev.next=current.next;
    				current.next=null;
    				current=null;
    				return true;
    			}else {
    				//current is null 
    				System.out.println(value+"Value not found");
    			}
    		}
    	}
    	return false;
    }
    
    //delete node by postition
    public boolean deleteByPosition(int pos) {
    	if(pos==1) {
    	Node temp=head;
    	head=head.next;
    	temp.next=null;
    	return true;
    	}else {
    		Node prev=head;
    		Node current=head.next;
    		for(int i=1;current!=null&&i<=pos-2;i++) {
    			prev=prev.next;
    			current=current.next;
    		}
    		if(current!=null) {
    			prev.next=current.next;
    			current.next=null;
    			current=null;
    			return true;
    		}else {
    			System.out.println(pos+" is wrong");
    			return false;
    		}
    	}
    }
	public void displaydata() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}
