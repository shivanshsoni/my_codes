#include<stdio.h>
int main()
{
	int t,i,j,l;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		long int n;
		scanf("%ld",&n);
		long k=0;
		k=(k+(2+(n-1)*3)%1000007)%1000007;
		printf("%ld\n",k);
	}
}