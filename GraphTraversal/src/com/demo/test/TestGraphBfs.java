package com.demo.test;

import com.demo.beans.GraphBFS;

public class TestGraphBfs {

	public static void main(String[] args) {
		GraphBFS ob=new GraphBFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(0, 2);
		ob.addEdge(1, 4);
		ob.addEdge(2, 4);
		ob.addEdge(2, 3);
		System.out.println(ob);
		ob.traverseBfs(0);

	}

}
