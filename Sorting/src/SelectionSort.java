import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		AcceptData(arr);
		System.out.println("Entered Array");
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("sorted array:");
		System.out.println(Arrays.toString(arr));
	}
	private static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;// minimum index
			for(int j=i;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
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
