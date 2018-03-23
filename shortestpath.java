import java.util.Scanner;
class shortestpath
{
	static int v=9;
	int mindistance(int distance[], boolean bool[])
	{
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int gh=0;gh<v;gh++)
		{
			if(bool[gh]==false&&distance[gh]<=min)
			{
				min=distance[gh];
				min_index=gh;
			}
		}
		return min_index;
	}


	void printSolution(int distance[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < v; i++)
            System.out.println(i+" \t\t "+distance[i]);
    }
	void dijkstra(int graph[][],int src)
	{
		int distance[]=new int[v];

		boolean bool[]=new boolean[v];

		for(int i=0;i<v;i++)
		{
			distance[i]=Integer.MAX_VALUE;
			bool[i]=false;
		} 

		distance[src]=0;

		for(int j=0;j<v-1;j++)
		{
			int u=mindistance(distance,bool);

			bool[u]=true;

			for(int k=0;k<v;k++)
			{
				if(bool[k]==false&&graph[u][k]!=0&&distance[u]!=Integer.MAX_VALUE 
					&& distance[u]+graph[u][k]<distance[k])
				{
					distance[k]=distance[u]+graph[u][k];
				}
			}
		}
		printSolution(distance,v);
	}

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int graph[][]=new int[][]{
		{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0,11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9,14, 0, 0, 0},
        {0, 0, 0, 9, 0,10, 0, 0, 0},
        {0, 0, 4,14,10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8,11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}
		};

		shortestpath t=new shortestpath();
		t.dijkstra(graph,0);
	}
}