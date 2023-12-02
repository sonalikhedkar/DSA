package com.demo.beans;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
	boolean [][]adjGraph;
	private int vertices;
	public GraphBFS(int vertices) {
		super();
		this.vertices = vertices;
		adjGraph= new boolean[vertices][vertices];
		
	}
	
	public void addEdge(int i,int j)
	{
		adjGraph[i][j]=true;
		adjGraph[j][i]=true;
		
	}
	
	public void removeEdge(int i,int j)
	{
		adjGraph[i][j]=false;
		adjGraph[j][i]=false;
		
	}
	
	public void traverseBfs(int n)
	{
		boolean visited[]=new boolean[vertices];
		Queue <Integer> vqueue=new LinkedList<>();
		vqueue.add(n);
		visited[n]=true;
		//System.out.println(vqueue.size());
		while(vqueue.size()>0) {
			int path=vqueue.poll();
			System.out.print(path+" ");
			for(int i=0;i<adjGraph[path].length;i++) {
			  if(adjGraph[path][i]) {
				if(!visited[i]) {
					vqueue.add(i);
				}
				visited[i]=true;
			  }
			}
		}
	
	}
				
	public String toString() {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<adjGraph.length;i++) {
				for(int j=0;j<adjGraph[i].length;j++) {
					sb.append((adjGraph[i][j]?1:0)+"\t");
				}
				sb.append("\n");
			}
			return sb.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
