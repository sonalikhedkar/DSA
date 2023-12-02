package com.test;

import com.beans.AdjencencyList;

public class testGraph {

	public static void main(String[] args) {
		AdjencencyList ob=new AdjencencyList(5);
		ob.addEdge(0, 1);
		ob.addEdge(0, 3);
		ob.addEdge(1, 2);
		ob.addEdge(2,4);
		ob.displayGraph();
		ob.searchEdge(0, 1);
		//after deleting edge
		ob.removeEdge(0, 1);
		System.out.println("After deleting edge: ");
		ob.searchEdge(0, 1);
		
	}

}
