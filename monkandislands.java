import java.util.Scanner;
class monkandislands
{
	int mindistance(int v, int distance[], boolean bool[])
	{
		int min=Integer.MAX_VALUE;
		int min_index=-1;

		for(int y=0;y<v;y++)
		{
			if(bool[y]==false&&distance[y]<min)
			{
				min=distance[y];
				min_index=y;
			}
		}
		return min_index;
	}

	void dijkstra(int v, int graph[][], int n)
	{
		int distance[]=new int[v];
		boolean bool[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			distance[i]=Integer.MAX_VALUE;
			bool[i]=false;
		}
		distance[n]=0;
		for(int j=0;j<v-1;j++)
		{
			int u=mindistance(v, distance,bool);

			bool[u]=true;
			for(int k=0;k<v;k++)
			{
				if(bool[k]==false&&graph[u][k]!=0&&distance[u]!=Integer.MAX_VALUE&&distance[u]+graph[u][k]<distance[k])
				{
					distance[k]=distance[u]+graph[u][k];
				}
			}
		}
		printsolution(distance,v);
	}

	void printsolution(int distance[], int n)
	{
		System.out.println(distance[n-1]);
	}

	public static void main(String[]ags)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int graph[][]=new int[n][n];

			for(int u=0;u<m;u++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				graph[a-1][b-1]=1;
				graph[b-1][a-1]=1;
			}

			monkandislands mi=new monkandislands();
			mi.dijkstra(n , graph, 0);
		}
	}
}