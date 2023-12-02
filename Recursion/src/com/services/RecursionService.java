package com.services;

public class RecursionService {

	public int CalculateFact(int num) {
		int fact=1;
		if(num<0) {
			
		   return -1;
		}
		if(num==0) {
			return 1;
		}
		if(num==1) {
			return fact;
		}
		return fact=num*CalculateFact(num-1);
		
			
}

	public int sumOfNatural(int num) {
		int sum=1;
		if(num==1) {
			return sum;
		}
		return sum=num+sumOfNatural(num-1);
		
	}

}
