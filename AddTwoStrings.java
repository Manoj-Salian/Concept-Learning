package Learning;
//https://leetcode.com/problems/add-strings/
import java.util.ArrayList;
import java.util.List;

public class AddTwoStrings {

	public static void main(String[] args) {
				String num1= "11";
				String num2 = "123";
		        int i = num1.length() - 1;
		        int j = num2.length() - 1;
		        List<Integer> sum = new ArrayList();
		        int carry = 0;
		        
		        while(i >= 0 || j >= 0) {
		            int ni = i >= 0 ? num1.charAt(i--) - '0' : 0;
		            int nj = j >= 0 ? num2.charAt(j--) - '0' : 0;
		                        
		            int s = ni + nj + carry;
		            sum.add(s % 10);
		            carry = s >= 10 ? 1 : 0;
		        }
		        
		        if(carry > 0) sum.add(carry);
		        
		        StringBuilder sb = new StringBuilder();
		        for(i = sum.size() - 1; i >= 0; i--) {
		            sb.append(sum.get(i));
		        }
		        
		        System.out.println("sb  = "sb.toString());
	}

}
