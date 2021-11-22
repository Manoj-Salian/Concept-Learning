package com.learning;

import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/find-largest-word-dictionary-deleting-characters-given-string/
public class LongestStringInDict {

	public static void main(String[] args) {
		String[] arr = {"ale", "apple", "monkey", "plea"};
		String str = "abpcplea";
		PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> b.length() - a.length());
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			int i;
			String str1 = pq.poll();
			for(i=0;i<str1.length();i++) {
				if(str.indexOf(str1.charAt(i)) !=0) {
					break;
				}
			}
			
			if(str1.length() == i) {
				System.out.println(str1);
			}
		}
		
		System.out.println("String does not match element from dictionery");

	}

}
