
import java.util.Scanner;

public class SearchingWithRecursion {
	 static int cmpcnt=0;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		acceptArrayElements(arr);
		displayArrayElements(arr);
		System.out.println("Enter element to search: ");
		int num=sc.nextInt();
		int first=0,last=arr.length-1;
		int pos=recursiveBinarySearch(first,last,num,arr);
		if(pos!=-1) {
			System.out.println("element found at position: "+(pos));
		}else {
			System.out.println("element not found");
		}

	}

	private static int recursiveBinarySearch(int first,int last,int num, int[] arr) {
	       
	       while(first<=last) {
	    	   int mid=(first+last)/2;
	    	  cmpcnt++;
	    	   if(arr[mid]==num) { 
	    		   System.out.println(cmpcnt);
	    		   return mid+1;
	    	   }else if(arr[mid]<num) {
	    		   return recursiveBinarySearch(mid+1,last,num, arr);
	    	   }else {
	    		    return recursiveBinarySearch(first,mid-1,num, arr);
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
