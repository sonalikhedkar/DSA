
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		AcceptData(arr);
		System.out.println("Entered Array");
		System.out.println(Arrays.toString(arr));
//		BubbleSort(arr);
//		System.out.println("sorted array:");
//		System.out.println(Arrays.toString(arr));
		ModifiedBubbleSort(arr);
		System.out.println("sorted array:");
		System.out.println(Arrays.toString(arr));

	}
//this modified bubble sort
	private static void ModifiedBubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {//iteration
			//starting of iteration no swapping so flag is false
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++) {//Comparisons
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
				
			}
			//how array changes to each iteration
			System.out.println("iteration "+(i+1));
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}	
		}
		
	}

	private static void BubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void AcceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter number at"+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}
 
}
