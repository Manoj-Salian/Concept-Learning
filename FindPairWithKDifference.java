// finding pair with k difference in array
public class FindPairWithKDifference {

	public static void main(String[] args) {
		int[] a = {3,5,7,9,10,16};
		int k=2;
		int i=0;
		int j=1;
		while(i < a.length-1 && j<a.length) {
			if(a[j]-a[i] == k || a[i]-a[j] == k) {
				System.out.println(a[i] + " " + a[j]);
				i++;
				j++;
			}else if(a[j]-a[j] > k) {
				i++;
			}else 
				j++;
		}
		
	}

}
