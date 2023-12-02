package com.beans;

public class MyStringStack {
    private char[]arr;
    private int size;
    private int top;
    
    public MyStringStack() {
    	size=10;
    	arr=new char[size];
    	top=-1;//Initially no elements in the stack
    }
    public MyStringStack(int n) {
    	size=n;
    	arr=new char[size];
    	top=-1;
    }
    public boolean isEmpty() {
    	return top==-1;
    }
    public boolean isFull() {
    	return top==size-1;
    }
    public boolean push(char n) {
    	if(isFull()) {
    		System.out.println("Stack overflow");
    		return false;
    	}
    	top++;
    	arr[top]=n;
    	return true;
    }
    public char pop() {
    	if(isEmpty()) {
    		System.out.println("Stack underflow");
    		return '#';
    	}
    	char n=arr[top];
    	top--;
    	return n;
    }
}
