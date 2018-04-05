import java.util.*;
class topologicalsortme
{
	static LinkedList<Integer> list[];
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		//no of vertex
		int vertex= scan.nextInt();
		//no of edges
		int edges = scan.nextInt();
		list=new LinkedList[vertex];
		for(i=0;i<vertex;i++)
		{
			list[i]=new LinkedList();
		}
		boolean visited[]=new boolean[vertex];
		for(l=0;l<vertex;l++)
		{
			visited[l]=false;
		}
		for(j=0;j<edges;j++)
		{
			list[scan.nextInt()].add(scan.nextInt());
		}
		Stack stack=new Stack();

		for(k=0;k<vertex;k++)
		{
			if(!visited[k])
			{
				topologicalutil(k, visited, stack);
			}
		}
		System.out.println("Order of topological sort");
		for(l=0;l<vertex;l++)
		{
			System.out.print(stack.pop()+" ");
		}
		System.out.println("");
	}
	static void topologicalutil(int k, boolean visited[],Stack stack)
	{
		visited[k]=true;
		Iterator<Integer> it=list[k].iterator();
		int o;
		while(it.hasNext())
		{
			o=it.next();
			if(!visited[o])
			{
				topologicalutil(o, visited, stack);
			}
		}
		stack.push(k);
	}
}