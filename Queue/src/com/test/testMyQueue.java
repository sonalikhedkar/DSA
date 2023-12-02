package com.test;

import com.beans.MyQueue;

public class testMyQueue {

	public static void main(String[] args) {
		MyQueue ob=new MyQueue();
		ob.enqueue(1);
	       ob.enqueue(2);
	       ob.enqueue(3);
	       ob.enqueue(4);
	       ob.enqueue(5);
	       System.out.println(ob);
	       System.out.println("Queue is:");
	      System.out.println(ob.toString());
	       System.out.println("Deleted from fronts");
	       System.out.println(ob.dequeue());
	       System.out.println(ob.dequeue());
	       System.out.println(ob.dequeue());
//	       System.out.println(ob.dequeue());
//	       System.out.println(ob.dequeue());
	       System.out.println(ob);
	       ob.enqueue(1);
	       
	}

}
