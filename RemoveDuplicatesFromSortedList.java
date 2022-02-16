package Learning;
//https://www.youtube.com/watch?v=zIHe2V5Py3U
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		int[] num = removeDuplicate(a);
		System.out.println(num.toString());
	}
	
	public static int[] removeDuplicate(int[] nums) {
		int index = 1;
		for(int i=0;i<nums.length -1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[index] = nums[i+1];
				index++;
			}
		}
		return nums;
	}
}
