package Learning;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=NWM4e4yda0w
//https://leetcode.com/problems/insert-interval/
public class InsertInterval {

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[] newInterval = {2,5};

		int[][] result = insertInterval(intervals,newInterval);

	}

	private static int[][] insertInterval(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();
		for(int[] in: intervals) {
			if(in[1] < newInterval[0]) {
				result.add(in);
			}else if(in[0] > newInterval[1]) {
				result.add(newInterval);
				newInterval = in;
			}else {
				newInterval[0] = Math.min(newInterval[0], in[0]);
				newInterval[1] = Math.max(newInterval[1], in[1]);
			}
		}
		result.add(newInterval);
		return result.toArray(new int[result.size()][]);
	}

}
