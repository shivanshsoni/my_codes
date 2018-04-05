import java.util.Scanner;
class dijkstrasadjacency
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		//no of vertex
		t=scan.nextInt();
		int A[][]=new int[t][t];
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				A[i][j]=0;
			}
		}
		int s=scan.nextInt();
		for(i=0;i<s;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			A[a][b]=c;
			A[b][a]=c;
		}
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				System.out.println(A[i][j]);
			}
		}
		//Set the source
		int source=scan.nextInt();
		int dist[]=new int[t];
		boolean er[]=new boolean[t];
		for(int y=0;y<t;y++)
		{
			er[y]=false;
			dist[y]=Integer.MAX_VALUE;
		}
		dist[source]=0;
		for(i=0;i<t-1;i++)
		{
			int min=Integer.MAX_VALUE;
			int minindex=-1;
			for(j=0;j<t;j++)
			{
				if(er[j] == false && dist[j] <= min)
				{
					min=dist[j];
					minindex=j;
				}
			}
			er[minindex]=true;
			for(l=0;l<t;l++)
			{
				if(!er[l] && A[minindex][l]!=0 && dist[l]>A[minindex][l]+dist[minindex] && dist[minindex]!=Integer.MAX_VALUE)
				{
					dist[l]=dist[minindex]+A[minindex][l];
				}
			}
		}
		for(int g=0;g<t;g++)
		{
			System.out.println(dist[g]);
		}
	}
}