package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		int[][] result = merge(intervals);
		System.out.println("Post merging the intervals :");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i][0]+ " " + result[i][1]);
		}

	}

	public static int[][] merge(int[][] intervals) {
		List<int[]> result = new ArrayList();
		if (intervals.length <= 1)
			return intervals;
		Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
		int[] in = intervals[0];
		int i = 1;
		while (i < intervals.length) {
			if (in[1] < intervals[i][0]) {
				result.add(in);
				in = intervals[i];
			} else {
				in[1] = Math.max(in[1], intervals[i][1]);
			}
			i++;
		}
		result.add(in);

		return result.toArray(new int[result.size()][]);
	}

}
