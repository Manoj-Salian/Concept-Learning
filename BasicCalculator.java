package Learning;

import java.util.Stack;
//Basic Calculator
//https://leetcode.com/problems/basic-calculator-ii/
public class BasicCalculator {

	public static void main(String[] args) {
		String str= "3+2*2*2";
		
		Stack<Character> operatorSt = new Stack<>();
		Stack<Integer> operandSt = new Stack<>();
		
		int i=0;
		int prevNumber = 0;
		while(i<str.length()) {
			if(str.charAt(i) == '*' || str.charAt(i) == '/') {
				prevNumber = operandSt.pop();
				if(str.charAt(i) == '*')
				{
					int number = str.charAt(++i)-'0';
					operandSt.push(Math.multiplyExact(prevNumber, number));
					
				}else if(str.charAt(i) == '/') {
					int number = str.charAt(++i)-'0';
					operandSt.push(Math.floorDiv(prevNumber, number));
				}
					
			}else if(str.charAt(i) == '+' || str.charAt(i) == '-') {
				operatorSt.push(str.charAt(i));
			}else {
				operandSt.push(str.charAt(i) - '0');
			}
			i++;
		}
		
		while(!operatorSt.isEmpty()) {
			prevNumber = operandSt.pop();
			if(operatorSt.pop() == '+')
			{
				operandSt.push(operandSt.pop() + prevNumber);
			}else {
				operandSt.push(operandSt.pop() - prevNumber);
			}
			
		}
		
		System.out.println("Evaluation result is  : " + operandSt.pop());
	}
	
	

}
