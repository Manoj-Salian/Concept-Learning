import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	
	List<Integer> adj[];
	
	public BFS(int v) {
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int dest) {
		adj[source].add(dest);
	}

	public static void main(String[] args) {
		BFS bfs = new BFS(6);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		
		System.out.println(bfs.bfs(1, 2));
	}
	
	public int bfs(int source,int dest) {
		boolean[] visited = new boolean[adj.length];
		int shortestPathCount = 0;
		Queue<Integer> queue = new LinkedList<>();
		int[] parent = new int[adj.length]; 
		parent[source] = -1;
		queue.add(source);
		while(!queue.isEmpty()) {
			int n = queue.poll();
			if(n == dest) break;
			
			for(int neighbor :adj[n]) {
				if(!visited[neighbor]) {
					visited[n] = true;
					queue.add(neighbor);
					parent[neighbor] = n; 
				}
			}
			
		}
		int cur = dest;
		while(parent[cur] != -1) {
			shortestPathCount++;
			cur = parent[cur];
		}
		return shortestPathCount;
	}

}
