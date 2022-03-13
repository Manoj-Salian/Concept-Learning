package Learning;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=qBbZ3tS0McI
//https://leetcode.com/problems/generate-parentheses/
public class GenerateParenthesis {

	public static void main(String[] args) {
		int n=3;
		List<String> output_arr = generateParenthesis(n);
		
		for(String arr : output_arr) {
			System.out.println(arr);
		}
	}

	private static List<String> generateParenthesis(int n) {
		List<String> output_arr = new ArrayList<>();
		backtrack(output_arr,"",0,0,n);
		return output_arr;
	}

	private static void backtrack(List<String> output_arr, String cur_string, int open, int close, int max) {
		
		if(cur_string.length() == max*2) {
			output_arr.add(cur_string);
			return;
		}
		if(open < max) backtrack(output_arr,cur_string + "(",open+1,close,max);
		if(close < open) backtrack(output_arr,cur_string+ ")",open,close+1,max);
	}

}
