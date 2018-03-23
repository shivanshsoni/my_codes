import java.util.Scanner;
class seaco4
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int A[]=new int[m];
			int B[]=new int[n];
			int C[]=new int[m];
			int D[]=new int[m];
			int E[]=new int[m];
			for(j=0;j<m;j++)
			{
				C[j]=scan.nextInt();
				D[j]=scan.nextInt();
				E[j]=scan.nextInt();
			}
			for(k=m-1;k>=0;k--)
			{
				if(C[k]==1)
				{
					A[k]++;
				}
				else
				{
					for(l=D[k]-1;l<E[k];l++)
					{
						if(A[l]>0)
						{
							for(int b=D[l]-1;b<E[l];b++)
							{
								A[b]++;
							}
						}
					}
				}
			}
			int a;
			for(a=m-1;a>=0;a--)
			{
				if(C[a]==2&&A[a]!=0)
				{
					while(A[a]!=0)
					{
						for(int b=D[a]-1;b<E[a];b++)
						{
							A[b]++;
						}
						A[a]--;
					}
				}
			}
			int G[]=new int[n];
			for(int v=0;v<m;v++)
			{
				if(C[v]==1)
				{
					for(int y=D[v]-1;y<E[v];y++)
					{
						G[y]=(A[v]+G[y])%1000000007;
					}
				}
			}
			for(int df=0;df<n;df++)
			{
				System.out.print(G[df]%1000000007+" ");
			}
			System.out.println("");
		}
	}
}