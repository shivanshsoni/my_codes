import java.util.Scanner;
class bellmanford
{
	public static void main(String[]aths)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		//no of vertex
		t=scan.nextInt();
		//enter no of senes
		int senes=scan.nextInt();
		int A[]=new int[senes];
		int B[]=new int[senes];
		int C[]=new int[senes];
		
		for(i=0;i<senes;i++)
		{
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
			C[i]=scan.nextInt();
		}
		int src=scan.nextInt();
		int dist[]=new int[t];
		for(j=0;j<t;j++)
		{
			dist[j]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		for(l=0;l<t-1;l++)
		{	
			for(k=0;k<senes;k++)
			{
				int u = A[k];
				int v = B[k];
				int weight = C[k];
				if(dist[u]!=Integer.MAX_VALUE && dist[v]> dist[u]+weight)
				{
					dist[v]=dist[u]+weight;
				}
			}
		}
		System.out.println("Vertex        Distance from source");
		for(l=0;l<t;l++)
		{
			System.out.println("  "+(l+1)+"                   "+dist[l]);
		}
	}
}