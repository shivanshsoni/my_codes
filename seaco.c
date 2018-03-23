#include<stdio.h>

int main()
{
	long int t,i,j,k,l;
	scanf("%ld",&t);
	for(i=0;i<t;i++)
	{
		long n,m;
		scanf("%ld%ld",&n,&m);
		long int A[m];
		long int B[n];
		long int C[m];
		long int D[m];
		long int E[m];
		for(j=0;j<m;j++)
		{
			scanf("%ld%ld%ld",&C[j],&D[j],&E[j]);
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
					A[l]++;
				}
			}
		}
		for(long h=0;h<m;h++)
		{
			printf("%ld",A[h]);
		}
		long a;
		for(a=m-1;a>=0;a--)
		{
			if(C[a]==2)
			{
				while(A[a]!=0)
				{
					for(long b=D[a]-1;b<E[a];b++)
					{
						A[b]++;
					}
					A[a]--;
				}
			}
		}
		long G[n];
		for(long v=0;v<m;v++)
		{
			if(C[v]==1)
			{
				for(int y=D[v]-1;y<E[v];y++)
				{
					G[y]=(A[v]+G[y])%1000000007;
				}
			}
		}
		for(long df=0;df<n;df++)
		{
			printf("%ld ",G[df]%1000000007);
		}
		printf("\n");
	}
	return 0;
} 