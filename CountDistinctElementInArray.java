package com.sap.learning;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=j48e8ac7r20
public class CountDistinctElementInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,1,3,2,3,1};
		int k =3;
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<k;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		System.out.println(map.size());
		for(int i=k;i<a.length;i++) {
			
			if(map.get(a[i-k]) == 1) {
				map.remove(a[i-k]);
			}else {
				map.put(a[i-k], map.get(a[i-k])-1);
			}
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			
			System.out.println(map.size());
		}
	}

}
