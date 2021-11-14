package com.testing;

//https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/200-number-of-islands-medium.html
public class NoOfIsland {

	public static void main(String[] args) {
		int[][] a = {
				{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
		};
		
		System.err.println(countIsland(a));

	}

	private static int countIsland(int[][] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				
				if(a[i][j] == 1) {
					count++;
					dfs(a,i,j);
				}
			}
		}
		return count;
	}

	private static void dfs(int[][] a, int i, int j) {
		if(i<0 || j <0 || i >= a.length || j >=a[0].length || a[i][j] == 0) {
			return; 
		}
		
		a[i][j] = 0;
		dfs(a,i,j-1);
		dfs(a,i,j+1);
		dfs(a,i+1,j);
		dfs(a,i-1,j);
	}

}
