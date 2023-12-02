 import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		acceptArrayElements(arr);
		displayArrayElements(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to search: ");
		int num=sc.nextInt();
		int pos=binarySearch(num,arr);
		if(pos!=-1) {
			System.out.println("element found at position: "+(pos));
		}else {
			System.out.println("element not found");
		}

	}

	private static int binarySearch(int num, int[] arr) {
		    int first=0;
	        int last=arr.length-1;
	        int cmpcnt=0;
	        while(first<=last) {
	        	int mid=(first+last)/2;
	        	cmpcnt++;
	        	if(arr[mid]==num) {
	        		System.out.println("comparisions:"+cmpcnt);
	        		return mid+1;//position
	        	}else if(arr[mid]<num) {
	        		first=mid+1;
	        	}else {
	        		last=mid-1;
	        	}
	        }
		return -1;
	}

	private static void displayArrayElements(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("]\n");
	}
	
	

	private static void acceptArrayElements(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array element:"+(i+1));
			arr[i]=sc.nextInt();
		}
	}

}
