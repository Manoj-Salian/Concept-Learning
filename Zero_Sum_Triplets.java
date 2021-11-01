import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
public class Zero_Sum_Triplets {

	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1};
		int count = 0;
		List<List<Integer>> pairList = new LinkedList<>();
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1,k=arr.length-1;j<arr.length-1;j++) {
				if(arr[i]+arr[j]+arr[k] ==0) {
					pairList.add(Arrays.asList(arr[i],arr[j],arr[k]));
					count++;
				}
				k--;
			}
		}
		System.out.println(count);
	}

}
