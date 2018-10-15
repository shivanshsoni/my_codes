import java.util.*;
class ContainCycle
{
	static class Graph
	{
		int v;
		LinkedList<Integer>  list[];
		public Graph(int v)
		{
			this.v = v;
			list = new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				list[i]=new LinkedList();
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Graph graph = new Graph(t);
		int n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph.list[a].add(b);
		}
		if(isCycle(graph))
		{
			System.out.println("Has Cycle");
		}
		else
		{
			System.out.println("No cycle");
		}
	}

	public static boolean isCycle(Graph graph)
	{
		HashSet<Integer> white = new HashSet<Integer>();
		HashSet<Integer> black = new HashSet<Integer>();
		HashSet<Integer> grey = new HashSet<Integer>();
		for(int t=0;t<graph.v;t++)
		{
			white.add(t);
		}
		while(!white.isEmpty())
		{
			Iterator<Integer> gh = white.iterator();
			int g=0;
			if(gh.hasNext())
			{
				g = gh.next();
			}
			else
			{
				return false;
			}
			white.remove(g);
			grey.add(g);
			Iterator<Integer> i = graph.list[g].listIterator();
			if(i.hasNext())
			{
				int p=i.next();
				if(white.contains(p))
				{
					grey.add(i.next());
					white.remove(p);
				}
				else if(grey.contains(p))
				{
					return true;
				}
			}
			else
			{
				int p=i.next();
				black.add(p);
				grey.remove(p);
			}
			//System.out.println(white+" "+grey+" "+black);
		}
		return false;
	}
}