#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	scanf("%d",&t);
	while(t--)
	{
		int n,q,x,y,val,c=0;
		scanf("%d%d",&n,&q);
		int a[n];
		bool vis[n];
		memset(vis,false,sizeof(vis));
		pair< pair<int,int> ,int> p[q];
		for(int i=0;i<q;i++)
		{
			scanf("%d%d%d",&x,&y,&val);
			p[i]=make_pair(make_pair(x,y),val);
			if(val==0)
			{
				if(!vis[x-1])
				{
					a[x-1]=0;
					vis[x-1]=true;
				}
				if(!vis[y-1])
				{a[y-1]=0;
				vis[y-1]=true;}
			}
			else
			{
				if(!vis[x-1]&&!vis[y-1])
				{
					a[x-1]=0;
					a[y-1]=1;
					vis[x-1]=true;
					vis[y-1]=true;
					continue;
				}
				if(!vis[x-1])
				{a[x-1]=1;
				vis[x-1]=true;
				if(!vis[y-1])
				{a[y-1]=1;
				vis[y-1]=true;}
			}
		}}
		for(int i=0;i<q;i++)
		{
			int d=abs(p[i].first.first-p[i].first.second);
			if(d!=p[i].second)
			{
				c=1;
				break;
			}
		}
		if(c)
		printf("no\n");
		else
		printf("yes\n");
	}
}