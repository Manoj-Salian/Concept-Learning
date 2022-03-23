package Learning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://www.geeksforgeeks.org/sort-elements-by-frequency/
public class SortByFrequency {

	public static void main(String[] args) {
		int[] a= {2, 5, 2, 8, 5, 6, 8, 8};
		
		List<Integer> list = new ArrayList<>();
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			list.add(a[i]);
		}
		
		Collections.sort(list,( n1, n2) ->{
				int freq1 = map.get(n1);
				int freq2 = map.get(n2);
				if(freq1 != freq2) {
					return freq2 - freq1;
				}else {
					return n1-n2;
				}
			});
			
		
		for(int items : list) {
			System.out.println(items);
		}
	}

}

