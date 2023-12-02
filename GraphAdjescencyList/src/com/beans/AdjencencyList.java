package com.beans;

public class AdjencencyList {
	private int vertices;
   private SingleLL[] graph;
   public AdjencencyList(int v) {
	   vertices=v;
	   graph=new SingleLL[vertices];
	   for(int i=0;i<vertices;i++) {
		   graph[i]=new SingleLL();
	   }
   }
   //adding edge at starting for undirected graph
   public void addEdge(int i,int j) {
	   //undirected graph
	   graph[i].addStart(j);
	   graph[j].addStart(i);
   }
   //remove add from graph
   public void removeEdge(int i,int j) {
	   //undirected graph
	   graph[i].removeByKey(j);
	   graph[j].removeByKey(i);
   }
   //search edge from 
   public void searchEdge(int i,int j) {
	   if(graph[i].search(j)&&graph[j].search(i)) {
		   System.out.println("there is edge between "+i+" To "+j+" and "+j+" To "+i);
	   }else {
		   System.out.println("there is no edge between "+i+" To "+j+" and "+j+" To "+i);
	   }
   }
   //to display graph
   public void displayGraph() {
	   for(int i=0;i<vertices;i++) {
		   System.out.print(i+"--->");
		   graph[i].displaydata();
	   }
   }
    
    
}
