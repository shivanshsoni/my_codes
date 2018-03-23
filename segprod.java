import java.util.Scanner;
class segprod
{
	static Long sum1=1L;

	static void build(int node, int start, int end, Long A[], int p, Long C[])
	{
		if(start==end)
		{
			C[node]=A[start]%p;
		}
		else
		{
			int mid=start+(end-start)/2;

			build(2*node,start,mid,A,p,C);

			build(2*node+1,mid+1,end,A,p,C);

			C[node]=((C[2*node]*C[2*node+1]))%p;
		}
		System.out.println(node);
	}

	static Long query(int node, int start, int end, int l, int r , int p, Long C[])
	{
		if(r<start||l>end)
		{
			return 1L;
		}
		if(l<=start && r>=end)
		{
			return C[node]%p;
		}
		int mid=start+(end-start)/2;
		Long f=query(2*node,start,mid,l,r,p,C);
		Long g=query(2*node+1,mid+1, end, l,r,p,C);
		sum1=((f%p)*(g%p))%p;
		//System.out.println(sum1);
		return sum1;
	}

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int p=scan.nextInt();
			int q=scan.nextInt();
			Long A[]=new Long[n+1];
			Long C[]=new Long[40000000];
			for(j=1;j<=n;j++)
			{
				A[j]=scan.nextLong();
				A[j]=A[j]%p;
			}
			build(1,1,n,A,p,C);
			k=(int) Math.floor(q/64) + 2;
			int B[]=new int[k];
			for(l=0;l<k;l++)
			{
				B[l]=scan.nextInt();
			}
			int x=0;
			int L=0;
			int R=0;
			int Lprev=0;
			int Rprev=0;;
			Long sum=1L;
			int xprev=0;
			for(int y=0;y<q;y++)
			{
				if(y==0)
				{
					x=0;
					L=(B[y/64]+x)%n;
					R=(B[(y/64)+1]+x)%n;
					if(L>R)
					{	
						int u=R;
						R=L;
						L=u;
					}
					//System.out.println(L+" "+R);
					Lprev=L;
					Rprev=R;
					//System.out.println(L+" "+R);

					sum=(query(1,1,n,L+1,R+1,p,C))%p;
					
					xprev=sum.intValue();
					//System.out.println(x+" "+xprev);
				}
				else if(y%64==0&&y>0)
				{
					x=(xprev+1)%p;
					L=(B[y/64]+x)%n;
					R=(B[(y/64)+1]+x)%n;
					if(L>R)
					{	
						int u=R;
						R=L;
						L=u;
					}
					//System.out.println(L+" "+R);
					Lprev=L;
					Rprev=R;
					sum=1L;
					//System.out.println(L+" "+R);
					sum=(query(1,1,n,L+1,R+1,p,C))%p;
					
					xprev=sum.intValue();
					//System.out.println(x+" "+xprev);
				}
				else
				{
					x=(xprev+1)%p;
					L=(Lprev+x)%n;
					R=(Rprev+x)%n;
					if(L>R)
					{	
						int u=R;
						R=L;
						L=u;
					}
					Lprev=L;
					Rprev=R;
					sum=1L;
					//System.out.println(L+" "+R);
					sum=(query(1,1,n,L+1,R+1,p,C))%p;
					//System.out.println(L+" "+R);
					
					xprev=sum.intValue();
					//System.out.println(x+" "+xprev);
				}
			}
			System.out.println((xprev+1)%p);
		}
	}
}