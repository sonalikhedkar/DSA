import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		acceptArrayElements(arr);
		displayArrayElements(arr);
		System.out.println("Enter element to search: ");
		int num=sc.nextInt();
		int pos=linearSearch(num,arr);
		if(pos!=-1) {
			System.out.println("element found at position: "+(pos));
		}else {
			System.out.println("element not found");
		}
	}
	//method for searching element by linear search
	
	private static int linearSearch(int num, int[] arr) {
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==num) {
				return j+1;
			}
		}
		return -1;
	}

	///method for accepting array elements
	private static void acceptArrayElements(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array element:"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	private static void displayArrayElements(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("]");
	}
	

}