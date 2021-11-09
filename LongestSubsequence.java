package com.sap.learning;

import java.util.Arrays;

public class LongestSubsequence {
	
	//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
	public static void main(String[] args) {
		int a[]= {2,5,7,1,8,9,10,12,13,11};
		Arrays.sort(a);
		int end=0;
		int maxCount=Integer.MIN_VALUE;
		int count = 1;
		while(end < a.length-1) {
			if(a[end]+1 == a[end+1]) {
				maxCount = Math.max(maxCount, count);
				count++;
			}else {
				count =1;
			}
			end++;
		}
		System.out.println(maxCount);
	}

}
