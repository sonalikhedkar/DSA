package com.test;

import com.beans.DoublyLinkedList;

public class testDoublyLL {

	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.AddAtEnd(10);
		ob.AddAtEnd(12);
		ob.displayList();
		System.out.println("Adding 30 at 3 pos");
		ob.AddGivenPostion(30,3);
		ob.displayList();
		System.out.println("Delete 12 from list");
		ob.deleteByValue(12);
		ob.displayList();

	}

}
