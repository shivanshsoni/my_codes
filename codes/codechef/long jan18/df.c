#include<stdio.h>
int main()
{
	long int t,i,j;
	scanf("%ld",&t);
	i=0;
	long long int k=1;
	long long int l=1;
	long long int f=1L;
	if(t==1)
	{
		System.out.println("2");
	}
	else if(t==2)
	{
		System.out.println("4");
	}
	else if(t==3)
	{
		System.out.println("8");
	}
	else if(t==4)
	{
		System.out.println("")
	}
	else
	{
	while(i!=t)
	{
		for(k=4;;k++)
		{
			int p=0;
			for(l=2;l<=k;l=l+2)
			{
				if(k%(l*l)==0)
				{
					p=1;
					break;
				}
			}
			if(p==1)
			{
				i++;
				//System.out.println(i+" "+k);
				if(i==t)
				{
					f=k;
					break;
				}
			}
		}
	}
	printf("%lld",f);
}