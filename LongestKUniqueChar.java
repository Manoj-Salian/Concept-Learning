package com.testing;

import java.util.HashMap;
import java.util.Map;

//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1/
public class LongestKUniqueChar {

	public static void main(String[] args) {
		String s = "aabacbebebe"; 
		int k = 3;
		int end=0,start=0;
		int max = Integer.MIN_VALUE;
		Map<Character,Integer> map = new HashMap<>();
		while(end < s.length()) {
			
			if(map.containsKey(s.charAt(end))) {
				map.put(s.charAt(end), map.get(s.charAt(end))+1);
				max = Math.max(max, end-start+1);
				end++;
			}else {
				if(map.size() >= k) {
					while(map.get(s.charAt(start)) > 1) {
						map.put(s.charAt(start), map.get(s.charAt(start))-1);
						start++;
					}
					map.remove(s.charAt(start));
					
					start++;
				}else {
					map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0)+1);
					max = Math.max(max, end-start+1);
					end++;
				}
			}
		}
		System.out.println("Longest K unique char is : " + max);
	}

}
