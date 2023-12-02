package com.beans;

public class MyStack {
    private int[]arr;
    private int size;
    private int top;
    
    public MyStack() {
    	size=10;
    	arr=new int[size];
    	top=-1;//Initially no elements in the stack
    }
    public MyStack(int n) {
    	size=n;
    	arr=new int[size];
    	top=-1;
    }
    public boolean isEmpty() {
    	return top==-1;
    }
    public boolean isFull() {
    	return top==size-1;
    }
    public boolean push(int n) {
    	if(isFull()) {
    		System.out.println("Stack overflow");
    		return false;
    	}
    	top++;
    	arr[top]=n;
    	return true;
    }
    public int pop() {
    	if(isEmpty()) {
    		System.out.println("Stack underflow");
    		return -1;
    	}
    	int num=arr[top];
    	top--;
    	return num;
    }
}
