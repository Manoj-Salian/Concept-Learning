//https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1
public class JumpingNumbersII {

	public static void main(String[] args) {
		int x=45;
		
		boolean bJumpingNo = checkJumpingNumber(x);
		if(bJumpingNo) {
			System.out.println("is Jumping number");
		}
		
	}

	private static boolean checkJumpingNumber(int num) {
		int rem = 0;
		int prev_no = -1;
		
		while(num > 0) {
			rem = num % 10;
			if(prev_no != -1) {
				if(prev_no +1 == rem || prev_no -1 == rem ) {
					num = num/10;
					continue;
				}
			}else {
				prev_no = rem;
			}
			num = num/10;
		}
		return true;
	}

	
}
