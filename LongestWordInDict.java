import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-word-in-dictionary/
//https://www.youtube.com/watch?v=waIgDZZp9Wc
public class LongestWordInDict {

	public static void main(String[] args) {
		String[] word = {"a","banana","app","appl","ap","apply","apple"};
		Arrays.sort(word);
		Set<String> set = new HashSet<>();
		String result = "";
		for(String w: word ) {
			if(w.length() ==1 || set.contains(w.substring(0,w.length()-1)) ) {
				if(w.length() > result.length()) {
					result = w;
				}
				set.add(result);
			}
		}
		
		System.out.println(result);
		
		
	}

}
