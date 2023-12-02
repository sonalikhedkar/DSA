import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		int size;
		
		System.out.println("Enter the size of Array:");
		Scanner sc=new Scanner (System.in);
		size=sc.nextInt();
		int [] arr=new int[size];
		acceptArray(arr);
		System.out.println("Entered array elements are: ");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {
		boolean flag=false;
		for (int i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
		
	}

	private static void acceptArray(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the array element at position "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}

}
