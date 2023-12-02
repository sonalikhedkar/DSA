package com.beans;

import java.util.Arrays;

public class MyQueue {
     private int[]arr;
     private int size;
     private int front;
     private int rear;
     
     public MyQueue() {
    	 size=5;
    	 arr=new int[size];
    	 front=0;
    	 rear=-1;
    	 
     }
     public MyQueue(int n) {
    	 size=n;
    	 arr=new int[size];
    	 front=0;
    	 rear=-1;
     }
     public boolean isFull() {
    	 return rear==size-1;
     }
     public boolean isEmpty() {
    	 return front>rear;
     }
     //add to queue
     public void enqueue(int num){
    	 if(isFull()) {
    		 System.out.println("Queue is full");
    	 }else {
    		 rear++;
    		 arr[rear]=num;
    		 System.out.println("Added succefully!");
    	 }
    	 
     }
     public int dequeue() {
    	 if(isEmpty()) {
    		 System.out.println("Queue is empty");
    		 return -1;
    	 }
    	 int num1=arr[front];
    	 front++;
    	 return num1;
     }
    
     
     public String toString() {
 		return Arrays.toString(arr)+" front :"+front+" rear: "+rear;
 	}
}
