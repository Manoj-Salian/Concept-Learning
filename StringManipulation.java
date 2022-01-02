//https://www.youtube.com/watch?v=WHR1trMsvOE
public class StringManipulation {

	public static void main(String[] args) {
		String str = "abcd";
		
		if(str== null || str.length() == 0 ) System.out.println("You need to have letters for permutations");
		else 
			printpermutations("",str);
		
	}

	private static void printpermutations(String prefix, String remainingString) {
		
		if(remainingString.length() == 0) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<remainingString.length();i++) {
			printpermutations(prefix+remainingString.charAt(i),remainingString.substring(0,i)+remainingString.substring(i+1,remainingString.length()));
		}
		
	}

}
