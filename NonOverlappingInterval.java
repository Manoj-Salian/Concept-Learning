package Learning;

import java.util.Arrays;
//https://leetcode.com/problems/non-overlapping-intervals/
public class NonOverlappingInterval {

	public static void main(String[] args) {
		int[][] intervals = { {1,2},{1,2},{1,2} };
		System.out.println(countOverlappingIntervals(intervals));
	}

	private static int countOverlappingIntervals(int[][] intervals) {
		Arrays.sort(intervals,(in1,in2)->in1[0]-in2[0]);
		int i=1,count=0;
		int[] in = intervals[0];
		while(i < intervals.length) {
			if(intervals[i][0] < in[1]) {
				in[1] = Math.min(in[1], intervals[i][1]);
				count++;
			}else {
				in = intervals[i];
			}
			
			i++;
		}
		return count;
	}

}
