 package com.test;

import com.beans.AdjencencyMatrix;

public class testAdjencencyMatrix {

	public static void main(String[] args) {
		AdjencencyMatrix obj=new AdjencencyMatrix(5);
		obj.addEdge(0, 1);
		obj.addEdge(0, 2);
		obj.addEdge(2, 3);
		obj.addEdge(2, 4);
		System.out.println(obj);
		

	}

}
