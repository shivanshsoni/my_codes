import java.util.*;
public class DetectCycle
{
	static class Graph
	{
		int v;
		LinkedList<Integer> A[];
		public Graph(int v)
		{
			this.v = v;
			A = new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				A[i] = new LinkedList<>();
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int t,i,j,k,l;
		Graph graph = new Graph(scan.nextInt());
		t=scan.nextInt();
		int start;
		for(i=0;i<t;i++)
		{
			insert(graph, scan.nextInt(), scan.nextInt());
		}
		System.out.println(checkCycle(graph));
	}

	public static void insert(Graph graph, int a, int b)
	{
		graph.A[a].add(b);
	}

	public static boolean checkCycle(Graph graph)
	{
		Boolean visited[] = new Boolean[graph.v];
		Boolean stacks[] = new Boolean[graph.v];

		for(int i=0;i<graph.v;i++)
		{
			if(isCyclicutil(graph, i, visited, stacks))
			{
				return true;
			}
		}

		return false;
	}

	public static boolean isCyclicutil(Graph graph, int start, Boolean visited[], Boolean stack[])
	{
		if(stack[start])
		{
			return true;
		}
		
		if(!visited[start])
		{
			return false;
		}

		visited[start] = true;

		stack[start] = true;

		List<Integer> children = graph.A[start];

		for (Integer c: children)
            if (isCyclicutil(graph, c, visited, stack))
                return true;
                 
        stack[start] = false;
 
        return false;
	}
}