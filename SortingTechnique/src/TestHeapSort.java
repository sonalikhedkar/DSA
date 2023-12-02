import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {65,35,26,13,23,12,91};
		System.out.println("Given Array:");
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		//convert array into max heap
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		//after heapfy put largest element at last
		for(int j=n-1;j>=0;j--) {
			int temp=arr[0];
			arr[0]=arr[j];
			arr[j]=temp;
			heapify(arr,j,0);
			System.out.println("size"+j);
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void heapify(int[] arr, int n, int i) {		// TODO Auto-generated method stub
		int largest=i;//root 
		int l=2*i+1;//left child
		int r=2*i+2;//right child
		if(l<n&& arr[l]>arr[largest]) {
			largest=l;
			
		}
		if(r<n&& arr[r]>arr[largest]) {
			largest=r;
		}
		//if root not largest
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
	}

}
