package Learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/combination-sum-iii/
//https://www.youtube.com/watch?v=KSmI_ES0txI
public class CombinationSum_IV {

	public static void main(String[] args) {
		int k =3,n=7;
		
		System.out.println(combinationsSum3(k,n));
		
	}

	private static List<List<Integer>>combinationsSum3(int combinationLength, int combinationSum) {
		List<List<Integer>> result = new ArrayList<>();
		combinations(1,combinationLength,combinationSum,new LinkedList() , result);
		return result;
	}

	private static void combinations(int start, int combinationLength, int combinationSum, LinkedList ll,
			List<List<Integer>> result) {
		
		if(combinationLength <0 || combinationSum <0) {
			return;
		}
		
		if(combinationLength ==0 && combinationSum == 0 ) {
			result.add(new ArrayList(ll));
		}
		
		for(int i=start;i<=9;i++) {
			ll.add(i);
			combinations(i+1,combinationLength-1,combinationSum-i,ll, result);
			ll.removeLast();
		}
	}

	private static int combinations(int[] num, int target) {
		int n = num.length;
		int i,j;
		int[] dp = new int[target+1];
		
		for(i=0;i<target;i++) {
			dp[i] = 0;
		}
		dp[0] = 1;
		for(i=1;i<=target;i++) {
			for(j=0;j<n;j++) {
				if(i >= num[j]) {
					dp[i]=dp[i]+dp[i-num[j]];
				}
			}
		}
		
		return dp[target];
	}

}
