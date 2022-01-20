package Learning;
//find median of two sorted list
public class FindMedianInSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		int middlePosition = (arr1.length + arr2.length)/2;
		boolean isOneMiddleNumber = (arr1.length + arr2.length) % 2 == 0  ? false:true;
		int i=0,j=0;
		int count=0;
		int sum = 0;
		
		if(!isOneMiddleNumber) {
			middlePosition = middlePosition -1;
		}
		while(i<arr1.length && j< arr2.length) {
			
			if(count == middlePosition &&  isOneMiddleNumber) {
				if(arr1[i] < arr2[j]) {
					System.out.println("Median is : " + arr1[i]);
					sum = sum+arr1[i];
				}else {
					System.out.println("Median is : " + arr2[j]);
					sum = sum+arr2[j];
				}
				break;
			}else if(count == middlePosition && !isOneMiddleNumber){
				//there are two numbers in the middle , below logic is to get those numbers and add it 
				for(int k=0;k<2;k++) {
					if(arr1[i] < arr2[j]) {
						System.out.println("Median is : " + arr1[i]);
						sum = sum+arr1[i];
						i++;
					}else {
						System.out.println("Median is : " + arr2[j]);
						sum = sum+arr2[j];
						j++;
					}
				}
				 System.out.println(sum/2);
				break;
			}
			if(arr1[i] < arr2[j]) {
				i++;
			}else 
				j++;
			
			count++;
		}
		
	}
	
	

}
