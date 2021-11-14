package com.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.youtube.com/watch?v=LPs6Qo5qlJM&ab_channel=NareshGupta
public class WordBreak {
	
	public static void main(String[] args) {
		String s= "leetcode";
		List<String> words= new ArrayList<>();
		Map<String,Boolean> map = new HashMap<>();
		words.add("leet");
		words.add("code");
		
		if(wordBreakUtil(s,words,map)) {
			System.out.println("string is part of wordbreak");
		}else {
			System.out.println("string is not part of wordbreak");
		}
		
	}

	private static boolean wordBreakUtil(String s, List<String> words,Map<String,Boolean>map) {
		if(words.contains(s))
			return true;
		if(map.containsKey(s))
			return true;
		for(int i=0;i<=s.length();i++) {
			String left = s.substring(0,i);
			if(words.contains(left) && wordBreakUtil(s.substring(i), words,map)) {
				map.put(s, true);
				return true;
			}
		}
		map.put(s, false);
		return false;
	}
	
	

}
