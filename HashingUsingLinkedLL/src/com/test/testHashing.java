package com.test;

import java.util.Scanner;

import com.beans.SingleLL;

public class testHashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of hashTable: ");
		int size=sc.nextInt();
		//creating array of linked list
	  SingleLL [] hashTable=new SingleLL[size];
	  
	  // each linked list 
	  for(int i=0;i<size;i++) {
		  hashTable[i]=new SingleLL();
	  }
	  int[] arr= {25,12,14,45,1,3,8,9};
	  for(int i=0;i<arr.length;i++) {
		  //first calculate position for data in hash table
		  int pos=arr[i]%hashTable.length;
		  hashTable[pos].addAtStart(arr[i]);
	  }
    for(int i=0;i<hashTable.length;i++) {
    	hashTable[i].display();
    }
    System.out.println("Enter number to search:");
    int num=sc.nextInt();
    int pos=num%hashTable.length;
    boolean status= hashTable[pos].search(num);
    if(status) {
    	System.out.println("Number"+num+"is present in hashTable in bucket: "+pos);
    }else {
    	System.out.println("Number is not in hashtable: "+num);
    }
	}

}
