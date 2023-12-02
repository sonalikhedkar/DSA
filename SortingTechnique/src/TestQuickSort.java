import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
       int[] arr= {54,26,93,17,77,31,44,55,20};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));	
		quickSort(arr,0,arr.length-1);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			//when partition then return partition index
			int p=partition(arr,start,end);
			System.out.println(Arrays.toString(arr));
			//this sort left portion of the partition 
			quickSort(arr,start,p-1);
			//this sort right part of the partition
			quickSort(arr,p+1,end);
		}
		
	}

	private static int partition(int[] arr, int first, int last) {
		int pivot=first;
		int i=first;
		int j=last;
		while(i<j) {
			//increment i till the value at i th position is <= pivot value
			while(i<last &&arr[i]<=arr[pivot]) {
				i++;
			}
			//decrement j till the value at j th position is >pivot
			while(j>first&&arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//when j cross i
		//then swap j and pivot and partition 
		//because pivot get  their position 
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
		
	}

	

}
