package com.test;

import com.beans.MyLinkedListStack;

public class TestStackLL {

	public static void main(String[] args) {
		MyLinkedListStack ob=new MyLinkedListStack();
        ob.push(11);
        ob.push(10);
        ob.push(20);
        ob.push(100);
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
	}

}
