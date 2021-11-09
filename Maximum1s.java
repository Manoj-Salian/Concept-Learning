package com.sap.learning;

public class Maximum1s {
	
	//https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1
	public static void main(String[] args) {
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int M=2;
		
		int start=0;
		int end=0;
		int max = Integer.MIN_VALUE;
		
		while(end < arr.length) {
			if(arr[end] == 0) {
				
				if(M>0) {
					M--;
				}else {
					while(arr[start] !=0) {
						start++;
					}
					start++;
				}
			}
			max= Math.max(max, end-start+1);
			end++;
		}
		System.out.println(max);
	}

}
