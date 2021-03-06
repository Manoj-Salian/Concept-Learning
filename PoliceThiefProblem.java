import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/discuss/interview-question/1396557/interview-question-police-and-thief
public class PoliceThiefProblem {

	public static void main(String[] args) {
		char[] arr = {'P','P','P','T','P','P','T','T','P'};
		int k = 2;
		System.out.println(catchThieves(arr,k));

	}
	


	private static int catchThieves(char[] arr, int k) 
	{ 
        Queue<Integer> tq = new LinkedList<>(); // queue to store index of thief
        Queue<Integer> pq = new LinkedList<>(); // queue to store index of police
        
        int counter = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 'T') {
                tq.offer(i);
            } else {
                pq.offer(i);
            }
        }
        
        while (!tq.isEmpty() && !pq.isEmpty()) {
            if (Math.abs(tq.peek() - pq.peek()) <= k) { // thief is within the reach of the policeman
                counter++;
                pq.poll();
                tq.poll();
            } else if (tq.peek() > pq.peek()) { // thief lies beyond the reach of the current policeman
                pq.poll();
            } else { // thief is not reachable from any of the police
                tq.poll();   
            }
        }
        
        return counter;
	} 
}
