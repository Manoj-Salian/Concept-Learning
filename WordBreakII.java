import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://www.youtube.com/watch?v=jQJyWcRPEpE&t=433s
public class WordBreakII {

	public static void main(String[] args) {
		String s = "pineapplepenapple";
		List<String>wordDict = new ArrayList<>(Arrays.asList("apple","pen","applepen","pine","pineapple"));
		List<String> results = wordBreak(s,wordDict);
		for(String word:results) {
			System.out.println(word);
		}
	}

	private static List<String> wordBreak(String s, List<String> wordDict) {
		return wordBreakHelper(s,wordDict,new HashMap<String,List<String>>());
		
	}

	private static List<String> wordBreakHelper(String s, List<String> wordDict, HashMap<String, List<String>> map) {
		if(map.containsKey(s)) {
			return map.get(s);
		}
		
		List<String> results = new ArrayList<>();
		if(s.length() ==0 ) {
			results.add("");
			return results;
		}
		
		for(String word:wordDict) {
			if(s.startsWith(word)) {
				String sub = s.substring(word.length());
				List<String> subStrings = wordBreakHelper(sub, wordDict, map);
				
				for(String subsString : subStrings) {
					String optionalSpace  = subsString.isEmpty()? "" : " ";
					results.add(word+optionalSpace+subsString);
				}
			}
		}
		map.put(s, results);
		return results;
	}

}
