package Learning;

//https://leetcode.com/problems/jump-game/
//https://www.youtube.com/watch?v=muDPTDrpS28&t=197s
public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1,0, 4 };
		if(canJump(nums)) {
			System.out.println("Can reach to last element");
		}else {
			System.out.println("Not reachable");
		}
	}

	private static boolean canJump(int[] nums) {
		int reachable = 0;

		for (int i = 0; i < nums.length; i++) {
			if (reachable < i) {
				return false;
			} else {
				reachable = Math.max(reachable, i + nums[i]);

			}
		}

		return true;
	}
}
