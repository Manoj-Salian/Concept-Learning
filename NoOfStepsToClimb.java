package com.sap.learning;

//https://www.youtube.com/watch?v=uHAToNgAPaM
//https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
public class NoOfStepsToClimb {
	
	public static void main(String[] args) {
		int n=4;
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i =2;i<= n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[n]);
	}

}
