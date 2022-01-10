package com.sap.createvehicle.odata.controller;

import java.util.PriorityQueue;

public class KLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {5,6,7,3,2,1,4};
		
		int k = 2;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b-a);
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		for(int i=0;i<k;i++) {
			System.out.println(pq.poll());
			
		}
		
	}

}
