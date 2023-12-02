import java.util.Scanner;

public class HashingUsingArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("size of hashtable: ");
		int size=sc.nextInt();
		int[]Hashtable=new int[size];
		int num;
		do{
			System.out.println("Enter number: ");
			num=sc.nextInt();
			if(num==-1) {
				break;
			}
			ArrayService.Add(num,Hashtable);
			
		}while(num!=-1);
	}

}
