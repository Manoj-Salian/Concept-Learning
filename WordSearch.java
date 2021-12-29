//https://www.youtube.com/watch?v=vYYNp0Jrdv0&t=94s
//https://leetcode.com/problems/word-search/
public class WordSearch {

	public static void main(String[] args) {
		String word = "ABCCEDF";
		char[][]board  = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
			};
		if(wordExists(board,word)) {
			System.out.println("word exists");
		}else {
			System.out.println("word does not exists");
		}
	}

	private static boolean wordExists(char[][] board, String word) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j] == word.charAt(0) && dfs(board,i,j,0,word)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, int i, int j, int count, String word) {
		if(count == word.length()) return true;
		
		if(i<0 || i >=board.length || j<0 || j>=board[i].length || board[i][j] != word.charAt(count)) {
			return false;
		}
		char temp = board[i][j];
		board[i][j] = ' ';
		count++;
		boolean found = dfs(board,i+1,j,count,word) ||
							dfs(board,i-1,j,count,word) ||
								dfs(board,i,j+1,count,word) ||
									dfs(board,i,j-1,count,word);
		board[i][j] = temp;
		return found;
		
		
	}

	
}
