package com.testing;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueCharSubString {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		
		int start=0;
		int end=0;
		int max = Integer.MIN_VALUE;
		
		Set<Character> set = new HashSet<>();
		while(end < s.length()) {
			if(!set.contains(s.charAt(end))) {
				set.add(s.charAt(end));
				max = Math.max(max, end-start+1);
				end++;
			}else {
				while(set.contains(s.charAt(end))) {
					set.remove(s.charAt(start));
					start++;
				}
			}
		}
		
		System.out.println("Length of the longest substring is : " + max);

	}

}
