import java.util.Arrays;

public class TestMergeSort {
	static int cnt;
	public static void main(String[] args) {
	
	       int[] arr= {63,52,7,10,65,50,55};
			System.out.println("Given array :");
			System.out.println(Arrays.toString(arr));
			//pass start, and end as last index position
			mergesort(arr,0,arr.length-1);
			System.out.println("sorted Array using merge sort: ");
			System.out.println(Arrays.toString(arr));

		}

	private static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			//left tree
			mergesort(arr,start,mid);
			//right tree
			mergesort(arr,mid+1,end);
			//to merge two sorted array
			merge(arr,start,end,mid);
		}
		
	}

	private static void merge(int[] arr, int start, int end, int mid) {
		
		int i,j,k;
		int n1=mid-start+1;//length of left tree
		int n2=end-mid;//length of right tree
		//temporary array for right and left part
		int[]leftarr=new int[n1];
		int[]rightarr=new int[n2];
		//add elements of left tree into left array 
		for(i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];//left tree from start	
		}
		//add elements of right tree into right array
		for(i=0;i<n2;i++) {
			rightarr[i]=arr[mid+1+i];//right tree from mid+1
		}
		i=0;
		j=0;
		k=start;//starting of every subtree right or left 
		//starting of first right tree is mid+1 not 0
			while(i<n1&&j<n2) {
				if(leftarr[i]<rightarr[j]) {
					arr[k]=leftarr[i];
					i++;
					k++;
				}else {
					arr[k]=rightarr[j];
					j++;
					k++;
				}
			}
			//if left array remains
			while(i<n1) {
				arr[k]=leftarr[i];
				i++;
				k++;
				
			}
			//if right array remains
		    while(j<n2) {
		    	arr[k]=rightarr[j];
		    	j++;
		    	k++;
		    }
		    cnt++;
		    System.out.println("for iteration "+cnt);
		    System.out.println("start :"+start+" end : "+end+" mid :"+mid);
			System.out.println(Arrays.toString(arr));
	}
}
