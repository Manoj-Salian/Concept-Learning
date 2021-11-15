import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,4,4,4,4,4}; 
		int k=2;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((num1,num2) -> map.get(num1)-map.get(num2));
        for(int num: map.keySet()) {
        	pq.add(num);
        	if(pq.size() > k) {
        		pq.poll();
        	}
        }
        System.out.println(Arrays.toString(pq.toArray()));
	}

}
