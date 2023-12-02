
	import java.util.Arrays;
	import java.util.Scanner;

	public class MergeData {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size for array1");
			int n=sc.nextInt();
			int[]arr1=new int[n];
			AcceptData(arr1);
			
			System.out.println("enter array size for array2");
			int n2=sc.nextInt();
			int[]arr2=new int[n2];
			AcceptData(arr2);
			
			
			int[]arr3=new int[arr1.length+arr2.length];
			System.out.println("Entered Array1");
			System.out.println(Arrays.toString(arr1));
			System.out.println("Entered Array2");
			System.out.println(Arrays.toString(arr2));
			
			mergeSort(arr1,arr2,arr3);
			System.out.println("Merged array:");
		    System.out.println(Arrays.toString(arr3));
		}
		
		private static void mergeSort(int[] arr1, int[] arr2, int[] arr3) {
			//i for arr1 ,j for arr2,k for arr3
			int i=0,j=0,k=0;
			while(i<arr1.length && j<arr2.length) {
				if(arr1[i]<arr2[j]) {
					arr3[k]=arr1[i];
					i++;k++;
				}else {
					arr3[k]=arr2[j];
					j++;k++;
				}
				
			}
			while(i<arr1.length) {
				arr3[k]=arr1[i];
				i++;
				k++;
				
			}
			while(j<arr2.length) {
				arr3[k]=arr2[j];
				j++;
				k++;
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
