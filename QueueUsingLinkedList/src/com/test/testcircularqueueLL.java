package com.test;

import com.beans.CircularqueueLL;

public class testcircularqueueLL {
	public static void main(String[] args) {
		CircularqueueLL n= new CircularqueueLL();
		n.enqueue(10);
		n.enqueue(20);
		System.out.println(n);
		n.enqueue(56);
		n.enqueue(7);
		n.enqueue(54);
		n.enqueue(73);
		n.enqueue(46);
		n.enqueue(671);
		n.dequeue();
		n.dequeue();
		//n.dequeue();
		//n.dequeue();
		System.out.println(n);
		n.display();
	}

}
