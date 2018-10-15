import java.util.*;
class Bfs11
{
	static class Graph
	{
		int V;
		LinkedList<Integer> ls[];
		public Graph(int V)
		{
			this.V = V;
			ls = new LinkedList[V+1];
			for(int i=1;i<=V;i++)
			{
				ls[i] = new LinkedList();
			}
		}
	}

	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int t,i,j,k,l;
		Graph graph = new Graph(scan.nextInt());
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph.ls[a].add(b);
			graph.ls[b].add(a);
		}

		bfs(graph);
	}

	public static void bfs(Graph graph)
	{
				
	}
}