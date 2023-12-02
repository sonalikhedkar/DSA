import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		AcceptData(arr);
		System.out.println("Entered Array");
		System.out.println(Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(arr));

	}
	private static void InsertionSort(int[] arr) {
		int n=arr.length;
		// i is starting of unsorted part
		for(int i=1;i<n;i++) {
			int key=arr[i];
			//j is end of sorted part
			 int j=i-1;
			for(;j>=0&&arr[j]>key;j--) {
				//shifting of number if small is there 
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			System.out.println("Array at  iteration :"+(i));
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
