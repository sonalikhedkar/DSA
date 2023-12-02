package com.beans;

import java.util.Arrays;

public class MyCircularQueue {
      private int []arr;
      private int size;
      private int front;
      private int rear;
       public MyCircularQueue() {
    	   size=10;
    	   arr=new int[size];
    	   front=-1;
    	   rear=-1;
       }
      public MyCircularQueue(int n) {
    	  size=n;
    	  arr=new int[size];
    	  front=-1;
    	  rear=-1;
      }
      public boolean isFull() {
    	  if(rear+1%size==front) {
    		  return true;
    	  }
    	  return false;
      }
      public boolean isEmpty() {
    	  if(front==rear&& front==-1) { 
    		  return true;
    	  }
    	   return false;
      }
      public void enqueue(int n) {
    	  if(front==-1) {
    		  front=(front+1)%size;
    		  rear=(rear+1)%size;
    		  arr[rear]=n;
    		  System.out.println("added in queue");
    	  }else {
    	  if(!isFull()) {
    	  rear=(rear+1)%size;
    	  arr[rear]=n;
    	  System.out.println("added in queue");
    	  }else {
    		  System.out.println("queue is full");
    	  }
    	  }
      }
      public int dequeue() {
    	  if(isEmpty()) {
    		  System.out.println("queue is empty");
    		  return -1;
    	  }
    	  int num=arr[front];
    	  if(rear==front) {
    		  rear=-1;
    		  front=-1;
    	  }else {
    		  front=(front+1)%size;
    	  }
		return num;
      }
      public String toString() {
    	  return Arrays.toString(arr)+"front: "+front+"rear: "+rear;
      }
}
