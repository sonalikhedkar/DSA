package com.beans;

public class AdjencencyMatrix {
      private boolean[][]matrix;
      private int vertices;
      public AdjencencyMatrix(int n) {
    	  vertices=n;
    	  matrix=new boolean[vertices][vertices];
      }
      //adding edge into undirected graph
      public void addEdge(int i,int j) {
    	  matrix[i][j]=true;
    	  matrix[j][i]=true;
      }
      //remove edge from graph
      public void removeEdge(int i,int j) {
    	  matrix[i][j]=false;
    	  matrix[j][i]=false;
      }
      public String toString() {
  		StringBuilder sb=new StringBuilder();
  		for(int i=0;i<matrix.length;i++) {//row
  			for(int j=0;j<matrix[i].length;j++) {//column
  				sb.append((matrix[i][j]?1:0)+"\t");
  			}
  			sb.append("\n");
  		}
  		return sb.toString();
      }
}
