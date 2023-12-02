package com.test;

import com.beans.CircularSinglyLL;

public class TestCircularLL {

	public static void main(String[] args) {
		CircularSinglyLL ob=new CircularSinglyLL();
		ob.AddByPostion(1, 10);//1
		ob.DisplayList();
		ob.AddByPostion(2, 20);//2
		
		ob.AddByPostion(7, 70);
		ob.DisplayList();
		ob.AddByPostion(3, 30);//3
		ob.AddByPostion(4, 40);//4
		ob.AddByPostion(3, 31);//5
		ob.AddByPostion(2, 100);//6
		ob.AddByPostion(8, 70);
		ob.DisplayList();
		
		
	}

}
