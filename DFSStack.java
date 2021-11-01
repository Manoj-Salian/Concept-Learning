import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSStack {

List<Integer> adj[];
	
	public DFSStack(int v) {
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int dest) {
		adj[source].add(dest);
	}
	
	public static void main(String[] args) {
		DFSStack dfs = new DFSStack(6);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		
		System.out.println(dfs.dfsStack(1, 6));
	}

	private boolean dfsStack(int source, int dest) {
		boolean[] visited = new boolean[adj.length];
		Stack<Integer> st = new Stack<>();
		st.push(source);
		visited[source] = true;
		
		while(!st.isEmpty()) {
			int cur = st.pop();
			if(cur == dest)  return true;
			
			for(int neighbor : adj[cur]) {
				if(!visited[neighbor]) {
					st.push(neighbor);
					visited[neighbor] = true;
				}
			}
		}
		return false;
		
	}
}
