import java.util.Scanner;
class dijkstrame
{
	public static void main(String[]aths)
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
				A[i][j]=scan.nextInt();
			}
		}
		//starting source
		int source = scan.nextInt();
		int dist[]=new int[t];
		boolean sop[]=new boolean[t];
		for(k=0;k<t;k++)
		{
			dist[k]=Integer.MAX_VALUE;
			sop[k]=false;
		}
		dist[source]=0;
		for(l=0;l<t-1;l++)
		{
			int min=Integer.MAX_VALUE;
			int minindex=-1;
			for(k=0;k<t;k++)
			{
				if(dist[k]<=min && sop[k]==false)
				{
					min=dist[k];
					minindex=k;
				}
			}
			sop[minindex] = true;
			for(j=0;j<t;j++)
			{	
				if(!sop[j] && A[j][minindex]!=0 && dist[minindex]!=Integer.MAX_VALUE && dist[j] > dist[minindex] + A[j][minindex])
				{
					dist[j]=dist[minindex] + A[j][minindex];
				}
			}	
		}
		for(i=0;i<t;i++)
		{
			System.out.println(dist[i]);
		}
	}
}