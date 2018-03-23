#include<stdio.h>
int main()
{
		int t,i,j,k,l,n,a,b,c,y,d;
		scanf("%d",&t);
		for(i=0;i<t;i++)
		{
			scanf("%d",&n);
			int A[n];
			for(j=0;j<n;j++)
			{
				scanf("%d",&A[j]);
			}
			scanf("%d",&k);
			for(y=0;y<k;y++)
			{
				scanf("%d%d%d",&a,&b,&c);
				int h=-1;
				for(l=a;l<=b;l++)
				{
					int g=0;
					for(d=a;d<=b;d++)
					{
						if(A[l]==A[d])
						{
							g++;
						}
					}
					if(g==c)
					{
						if(h==-1||h>A[l])
						h=A[l];
					}
				}
				printf("%d\n",h);
			}
		}
}