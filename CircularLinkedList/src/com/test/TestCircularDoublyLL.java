package com.test;

import com.beans.CircularDoublyLL;

public class TestCircularDoublyLL {

	public static void main(String[] args) {
		CircularDoublyLL ob=new CircularDoublyLL();
        ob.AddTheEnd(10);
       
        ob.AddTheEnd(20);
        ob.AddTheEnd(30);
        ob.AddTheEnd(40);
        ob.AddAtPostion(1, 80);
        ob.AddAtPostion(5, 400);
        ob.AddAtPostion(2,100);                                                                              
        ob.PrintLL();
        ob.deleteByValue(80);
        ob.PrintLL();
        ob.deleteByValue(10);
        ob.PrintLL();
        ob.deleteByValue(40);
        ob.PrintLL();
	}

}
