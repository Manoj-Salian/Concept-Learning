import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1
//https://www.youtube.com/watch?v=qEIGhVtZ-sg
public class LargestNoAfterMergingArray {

	public static void main(String[] args) {
		String[] arr = {"3", "30", "34", "5", "9"};
		System.out.println(printLargest(arr));

	}
	
	private static String printLargest(String[] arr) {
		  StringBuilder stringBuilder = new StringBuilder();

		    Arrays.sort(arr, (String a, String b) -> {
		        String ab=a+b;
		        String ba=b+a;
		        return ab.compareTo(ba) > 0 ? -1 :1;
		    });

		    for(int i=0;i<arr.length;i++){
		        stringBuilder.append(arr[i]);
		    }
		    if (stringBuilder.length()==0){
		        return "0";
		    }
		    return stringBuilder.toString();
		}
}
