import java.util.Arrays;
//https://www.lintcode.com/en/old/problem/meeting-rooms-ii/
//https://www.youtube.com/watch?v=dxVcMDI7vyI&t=618s  --- Minimum Plateform Required -- Reference
public class ManimumMeetingRoom {

	public static void main(String[] args) {

		Intervals[] intervals = new Intervals[3];
		intervals[0] = new Intervals();
		intervals[0].startTime = 0;
		intervals[0].endTime=30;
		
		intervals[1] = new Intervals();
		intervals[1].startTime = 5;
		intervals[1].endTime=10;
		
		intervals[2] = new Intervals();
		intervals[2].startTime = 15;
		intervals[2].endTime=20;
		
		
		System.out.println(minimumMeetingRooms(intervals));
	}

	private static int minimumMeetingRooms(Intervals[] intervals) {
		int max_so_far = 1;
		int current_max =1;
		int[] startTime = new int[intervals.length];
		int[] endTime = new int[intervals.length];
		
		for(int i=0;i<intervals.length;i++) {
			startTime[i] = intervals[i].startTime;
			endTime[i] = intervals[i].endTime;
		}
		
		Arrays.sort(startTime);
		Arrays.sort(endTime);
		
		int i=1;
		int j=0;
		
		while(i<intervals.length && j<intervals.length) {
			if(startTime[i] <= endTime[j]) {
				current_max++;
				i++;
			}else if(startTime[i] > endTime[j]){
				current_max--;
				j++;
			}
			
			max_so_far = Math.max(current_max, max_so_far);
			
		}
		
		return max_so_far;
	}

	

}


class Intervals {
	
	int startTime;
	int endTime;
} 
