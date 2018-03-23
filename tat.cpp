#include<iostream>
#include<vector>
using namespace std;
 
long long int x,x0;
long long int t[100000];
int N,Q;
vector<int> w[100000];
vector<int> m;
vector<int> W,v1,v2;
 
 
 
 
 
 
 
 
 
int calc2(int c1,int c2)
{
 
 
	if(c1==1)
 
 
	{
			if(c2==2)
					return(0);
 
 
			else
			{
 
					if(t[c2-3]!=0)
						return t[c2-3];
 
					x=abs((v1[c2-2]-1)?w[c2-2][(v1[c2-2]-2)]:0-(v2[c2-2]-1)?w[c2-2][v2[c2-2]-2]:0);
					x=min(x,w[c2-2][m[c2-2]-1]-x);
 
 
					t[c2-3]=calc2(1,c2-1)+W[c2-3]+x;
 
					return(t[c2-3]);
 
			}
 
	}
 
 
 
	return(calc2(1,c2)-calc2(1,c1+1));
}
 
 
 
 
int calc1(int c1,int c2)
{
 
 
 
	if(c1>c2&&c2!=1)
		return(calc2(c1,N+1)+calc2(1,c2)+W[N-1]+x0);
 
 
	if(c1>c2)
		return(calc2(c1,N+1));
 
	return(calc2(c1,c2));
 
}
 
 
 
int calc(int V1,int c1,int V2,int c2)
{
 
	int x1=abs(((V1>1)?w[c1-1][V1-2]:0));//-(v1[c1-1]>1)?w[c1-1][v1[c1-1]-2]:0);
 
	//if(c1==1&&c2==3&&V1==3&&V2==3)
	//cout<<"\n\n"<<x1<<"\t\n";
	x1=min(x1,w[c1-1][m[c1-1]-1]-x1);
 
	//if(c1==1&&c2==3&&V1==3&&V2==3)
	//cout<<"\n\n"<<x1<<"\t\n";
 
	int x2=abs((V2>1)?w[c2-1][V2-2]:0-((v2[c2-1]>1)?w[c2-1][(v2[c2-1]-2)]:0));
	x2=min(x2,w[c2-1][m[c2-1]-1]-x2);
	//if(c1==1&&c2==3&&V1==3&&V2==3)
	//cout<<"\n\n"<<x1<<"\t\t"<<x2<<"\t\t"<<calc1(c1,c2)<<"\t\t"<<W[c2>1?c2-2:N-1]<<"\n";
 
	if(c2>1)
	x=x1+x2+calc1(c1,c2)+W[c2-2];
	else
	x=x1+x2+calc1(c1,c2)+W[N-1];
 
 
	return x;
 
}
 
 
 
 
 
 
 
int main()
{
	int T,c1,V1,V2,c2,i,j;
	cin>>T;
	//cout<<"inside main()\n";
	while(T--)
	{
 
	//	cout<<"inside while()\n";
		cin>>N>>Q;
 
 
		for(i=0;i<N;i++)
		{
 
			cin>>x;
			m.push_back(x);
			cin>>x;
			w[i].push_back(x);
			for(j=1;j<m[i];j++)
			{
				cin>>x;
				w[i].push_back(x+w[i][j-1]);
			}
		}
 
 
		for(i=0;i<N;i++)
		{
			cin>>x;
			v1.push_back(x);
			cin>>x;
			v2.push_back(x);
			cin>>x;
			W.push_back(x);
		}
		x=v2[N-1];
		v2.erase(v2.begin()+N-1);
		v2.insert(v2.begin(),x);
		x=abs((v1[1]-1)?w[1][v1[1]-2]:0-(v2[1]-1)?w[1][(v2[1]-2)]:0);
		x=min(x,w[1][m[1]-1]-x);
		t[0]=W[0]+x;
 
 
		x0=abs((v1[0]-1)?w[0][v1[0]-2]:0-(v2[0]-1)?w[0][v2[0]-2]:0);
		x0=min(x0,w[0][m[0]-1]-x0);
 
 
		for(i=0;i<Q;i++)
		{
			cin>>V1>>c1>>V2>>c2;
 
 
			if(c1!=c2)
			x=min(calc(V1,c1,V2,c2),calc(V2,c2,V1,c1));
 
 
															else
															{
															x=abs(w[1][v1[1]-1]-w[1][v2[1]-1]);
																x=min(x,w[1][m[1]-1]-x);
															}
			cout<<x<<"\n";
		}
		for(i=0;i<N;i++)
			w[i].clear();
		m.clear();
		W.clear();
		v1.clear();
		v2.clear();
 
 
 
 
 
	}
}