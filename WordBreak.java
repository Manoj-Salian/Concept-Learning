import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://www.youtube.com/watch?v=jQJyWcRPEpE&ab_channel=NareshGupta
public class WordBreakII {

	public static void main(String[] args) {
		String s= "catsanddog";
		List<String> words= new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		words.add("cats");
		words.add("dog");
		words.add("cat");
		words.add("and");
		words.add("sand");
		
		List<String> list= wordBreakUtil(s,words,map);
		if(list.size() > 0) {
			System.out.println("words matches with dictionery");
		}else {
			System.out.println("words does not match with dictionery");
		}

	}

	private static List<String> wordBreakUtil(String s, List<String> words, Map<String, List<String>> map) {
		List<String> result = new ArrayList<>();
		
		if(map.containsKey(s)) {
			return map.get(s);
		}
		if(words.contains(s)) {
			result.add(s);
		}else {
			for(int i=1;i<=s.length();i++) {
				String left = s.substring(0,i);
				if(words.contains(left)){
					List<String> sublist = wordBreakUtil(s.substring(i),words,map);
					for(String str: sublist) {
						result.add(left+ " " + str);
					}
				}
			}
		}
		
		map.put(s, result);
		return result;
	}

}
