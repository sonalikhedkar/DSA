import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {

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
		//unsorted part
			for(int i=1;i<arr.length;i++) {
				int key=arr[i];
				int j=i-1;
				//sorted //shifting
				for( ;j>=0 && arr[j]>key;j--) {
					arr[j+1]=arr[j];
				}
				arr[j+1]=key;
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
