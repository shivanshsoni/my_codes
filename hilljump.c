#include<stdio.h>
long int main()
{
		long t,i,j,l,n;
		int k;
		scanf("%ld%ld",&t,&n);
		long long int A[t];
		for(i=0;i<t;i++)
		{
			scanf("%lld",&A[i]);
		}
		for(j=0;j<n;j++)
		{
			scanf("%d",&k);
			if(k==1)
			{
				long a,b;
				scanf("%ld%ld",&a,&b);
				long long int h=A[a-1];
				long p=a-1;
				long o=0;
				for(l=a;l<t;l++)
				{
					if(A[l]>h&&l-p<=100)
					{
						o++;
						p=l;
						h=A[l];
					}
					if(l-p>100)
					{
						break;
					}
					if(o==b)
					{
						break;
					}
				}
				printf("%ld\n",p+1);
			}
			if(k==2)
			{
				int a,b;
				scanf("%d%d",&a,&b);
				long int c;
				int y=0;
				scanf("%ld",&c);
				for(y=a-1;y<=b-1;y++)
				{
					A[y]=A[y]+c;
				}
			}
		}
		return 0;
}