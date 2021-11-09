package com.sap.learning;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=BVWxlcxW9Ww

public class MaximumInSubarryK {

	public static void main(String[] args) {
		int a[] = {1,2,2,1,3,2,3,1};
		Map<Integer,Integer> map = new HashMap<>();
		int k =3;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<k;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			max = Math.max(max, a[i]);
		}
		System.out.println(max);
		int start = 0;
		for(int i=k;i<a.length;i++) {
			if(max == a[start] && map.get(a[start]) <= 1) {
				map.remove(a[start]);
				max= Integer.MIN_VALUE;
			}else {
				map.put(a[start], map.get(a[start])-1);
				max = Math.max(max, a[i]);
			}
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			max = Math.max(max, a[i]);
			start++;
			System.out.println(max);
		}

	}

}
