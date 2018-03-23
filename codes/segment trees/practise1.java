import java.util.Scanner;
import java.util.*;
class practise1
{
	static int B[]=new int[4*500001];

	static int C[]=new int[4*500001];
	static void build(int node, int start, int end, int A[], int min, int max)
	{
		if(start==end)
		{
			B[node]=A[start];
			if(B[node]>=min&&B[node]<=max)
			{
				C[node]++;
			}
		}
		else
		{
			int mid=(start+end)/2;

			build(2*node,start,mid,A,min,max);

			build(2*node+1,mid+1,end,A,min,max);

			B[node]=Math.max(B[2*node],B[2*node+1]);
			if(B[node]>=min&&B[node]<=max)
			{
				C[node]++;
			}	

		}
	}

	static int query(int node, int start, int end, int l, int r)
	{
		if(r<start||l>end||start>end)
		{
			return 10000000;
		}
		if(l<=start && r>=end)
		{
			return C[node];
		}
		int mid=(start+end)/2;
		int f=query(2*node,start,mid,l,r);
		int g=query(2*node+1,mid+1, end, l,r);
		return f+g;
	}

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		int q=scan.nextInt();
		int min=scan.nextInt();
		int max=scan.nextInt();
		int A[]=new int[t+1];
		Arrays.fill(A,0);
		build(1,1,t,A,min,max);
		for(k=0;k<q;k++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			if(a==1)
			{
				A[a]=b;
				build(1,1,t,A,min,max);
			}
			else
			{
				System.out.println(query(1,1,t,b,c));
			}
		}
	}
}