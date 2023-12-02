package Question5;

import java.util.Arrays;
import java.util.Scanner;

public class OccurencesOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		//arr is sorted at the time of input
		int[]arr=new int[n];
		AcceptData(arr);
		System.out.println("Entered Array stored in sorted order :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter number to find no of occurences:");
		int num=sc.nextInt();
		Occurences(arr,num);

	}
	private static void Occurences(int[] arr, int num) {
		
		
	}
	private static void AcceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int j=0;
		while(j<arr.length) {
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			if(j==0) {
				arr[j]=num;
				j++;
			}
			
			if(arr[i]>num) {
				int temp=arr[i];
				arr[i]=num;
				arr[i+1]=temp;
				j++;
			}
			
		}
		
	  }
		
	}
	
}
