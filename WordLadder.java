package Learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//https://www.geeksforgeeks.org/word-ladder-length-of-shortest-chain-to-reach-a-target-word/
public class WordLadder {

	public static void main(String[] args) {
		// make dictionary
		Set<String> D = new HashSet<String>();
		D.add("poon");
		D.add("plee");
		D.add("same");
		D.add("poie");
		D.add("plie");
		D.add("poin");
		D.add("plea");
		String start = "toon";
		String target = "plea";
		System.out.print("Sequence is: " + shortestChainLen(start, target, D));

	}

	static int shortestChainLen(String start, String target, Set<String> D) {

		if (start == target)
			return 0;
		// If the target String is not
		// present in the dictionary
		if (!D.contains(target))
			return 0;
		while(!start.equals(target)) {
			start = findNextString(start,target,D);
			System.out.println(start);
		}

		return 0;
	}

	private static String findNextString(String start, String target, Set<String> d) {
		
		Iterator<String> it = d.iterator();
		String str = null;
		int count=0;
		while(it.hasNext()) {
			count=0;
			str = it.next();
			for(int i=0;i<str.length();i++) {
				if(start.charAt(i) != str.charAt(i)) {
					count++;
				}
				if(count > 1) {
					break;
				}
			}
			if(count == 1) {
				d.remove(str);
				break;
			}
				
		}
		return str;
	}

	

}
