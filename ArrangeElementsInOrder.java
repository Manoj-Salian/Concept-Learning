import java.io.IOException;
//Arrange even elements in even order and odd elements in odd order
public class ArrangeElementsInOrder {

    
	 public static void main(String[] args) throws IOException {
	    int[] arr= {5,10,15,20,25,30};
	    reArrangeElements(arr, arr.length);
	    
	 }   
	 
	 static void reArrangeElements(int arr[], int n) 
	 { 
	  int index = 0;
	  int tempIndex,tempEle;
	  while(index < arr.length) {
		  if(index % 2 ==0 ) {
			  if(arr[index] % 2 != 0) {
				  tempIndex = index;
				  tempEle = arr[index];
				  while(tempIndex <arr.length) {
					  if(arr[tempIndex] % 2 == 0) {
						  arr[index] = arr[tempIndex];
						  arr[tempIndex] = tempEle;
						  break;
					  }
					  tempIndex++;
					  
				  }
			  }
			  index++;
			  
		  } else if(index % 2 != 0){
			  if(arr[index] % 2 == 0) {
				  tempIndex = index;
				  tempEle = arr[index];
				  while(tempIndex <arr.length) {
					  if(arr[tempIndex] % 2 != 0) {
						  arr[tempIndex] = arr[index];
						  arr[index] = tempEle;
						  break;
					  }
					  tempIndex++;
				  }
			  }
			  index++;
		  }
	  }
	  
	  System.out.println(arr.toString());
	 }
}
