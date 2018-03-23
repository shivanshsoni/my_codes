#include<stdio.h>
int main()
{
		int t,i,j,k,l,n;
		scanf("%d",&t);
		for(i=0;i<t;i++)
		{
			scanf("%d",&n);
			int A[n];
			for(j=0;j<n;j++)
			{
				scanf("%d",&A[j]);
			}
			int p=0;
			l=0;
			int m;
			while(p!=1)
			{
				m=0;
				for(k=0;k<n-2;k++)
				{
					if(A[k]==0&&A[k+2]==0)
					{
						l++;
						m=1;
						break;
					}
				}	
				if(m==0)
					{
						p=1;
					}
					int y;
				for(y=k+2;y<n;y++)
				{
					A[y-1]=A[y];
				}
				n=n-1;
			}
			if(l%2!=0)
			{
				printf("Alice\n");
			}
			else
			{
				printf("Bob\n");
			}
		}
}