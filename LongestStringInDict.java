package com.learning;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/find-largest-word-dictionary-deleting-characters-given-string/
public class LongestStringInDict {

	public static void main(String[] args) {
		String[] arr = {"ale", "apple", "monkey", "plea"};
		String str = "abpcplea";

		Arrays.sort(arr,(String s1,String s2) -> s2.length() - s1.length());
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(int j=0;j<arr.length;j++) {
			Map<Character,Integer> tempMap = map;
			String arrString = arr[j];
			int k;
			for(k=0;k<arrString.length();k++) {
				if(str.indexOf(arrString.charAt(k)) == -1) {
					break;
				}
			}
			
			if(k == arrString.length()) {
				System.out.println(arrString);
			}
		}
	}
}
