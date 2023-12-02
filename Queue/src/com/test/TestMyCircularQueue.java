package com.test;

import com.beans.MyCircularQueue;

public class TestMyCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue ob=new MyCircularQueue(5);
       ob.enqueue(1);
       ob.enqueue(2);
       ob.enqueue(3);
       ob.enqueue(4);
       ob.enqueue(5);
       System.out.println(ob.dequeue());
       System.out.println(ob.dequeue());
       System.out.println(ob.dequeue());
       System.out.println(ob.dequeue());
       System.out.println(ob.dequeue());
       ob.enqueue(1);
       System.out.println(ob);
	}

}
