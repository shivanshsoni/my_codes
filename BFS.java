import java.util.*;
class BFS
{
	static class Graph
	{
		int v;
		LinkedList<Integer> A[];
		public Graph(int v)
		{
			this.v = v;
			A=new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				A[i]=new LinkedList<>();
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner scan  = new Scanner(System.in);
		int t,i,j,k,l;
		l=scan.nextInt();
		Graph graph = new Graph(l); 
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			insert(graph, scan.nextInt(), scan.nextInt());
		}
		mcv(graph, l,scan.nextInt());
	}	

	public static void mcv(Graph graph, int v,int start)
	{

		Boolean visited[] = new Boolean[v];
		Arrays.fill(visited, false);
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(start);

		while(q.size()!= 0)
		{
			v = q.poll();
			visited[v]=true;
			System.out.print(v+" ");
			Iterator it = graph.A[v].listIterator();
			while(it.hasNext())
			{
				int n = (int) it.next();
				if(!visited[n])
				{
					q.add(n);
					
				visited[n] = true;
				}
			}
		}
	}

	public static void insert(Graph graph, int a, int b)
	{
		graph.A[a].add(b);
	}
}