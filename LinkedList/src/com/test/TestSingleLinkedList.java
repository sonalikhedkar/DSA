package com.test;

import com.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		  SingleLinkedList ob=new SingleLinkedList();
		    ob.addEndofList(10);
		    ob.addEndofList(11);
		    ob.addAtPosition(12,1);
		    ob.addAtPosition(13, 3);
		    ob.addAtPosition(22, 3);
		    ob.addAtPosition(100, 4);
		    ob.displaydata();
		
	}
}
