package Learning;
//you are given an unsorted array .
//In an array you need to find if there is strcitly increasing subsequence of 3 elements 

public class IncreasingSubsequenceof3Elements {

	public static void main(String[] args) {
		int[] a = {15,9,6,4,5,7};
		//int[] a = {3,1,10,3,4};
		//int[] a = {2,1,4,6,8,4};
		int smallNo = a[0];
		int count = 1;
		for(int i=1;i<a.length;i++) {
			if(a[i] < smallNo) {
				smallNo= a[i];
			}else {
				count++;
			}
			if(count == 3) {
				System.out.println("found");
				break;
			}
		}
					
	}

}
