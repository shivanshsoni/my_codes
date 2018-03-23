import java.util.Scanner;
import java.util.*;
class shtarr
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int q=scan.nextInt();
			Long A[]=new Long[n+1];
			Long max2=0L;
			TreeSet<Long> trees=new TreeSet<Long>();
			int x=1;
			Long w=0L;
			for(j=1;j<=n;j++)
			{
				w=scan.nextLong();
				if(trees.add(w))
				{
					A[x]=w;
					if(max2<A[x])
					{	
						max2=A[x];
					}
					x++;
				}
			}
			for(k=1;k<=q;k++)
			{
				char str=scan.next().charAt(0);
				if(str=='?')
				{
					int a=scan.nextInt();
					int b=scan.nextInt();
					int c=scan.nextInt(); 
					int max=0;
					int s=1;
					Long D[]=new Long[n];
					Long fg=0L;
					for(int qw=a;qw<x;qw++)
					{
						if(qw==a)
						{
							D[s]=A[qw];
							fg=A[qw];
							s++;
						}
						else
						{
							if(A[qw]>fg)
							{
								D[s]=A[qw];
								fg=A[qw];
								s++;
							}
						}
					}
					TreeSet<Integer> ts=new TreeSet<Integer>();
					for(l=1;l<=c-b+1;l++)
					{
						Double B=b+l-1.5;
						//int g=0;
						//int max=0;
						if(B>max2)
						{
							break;
						}
						else
						{
							
							int u=1;
							for(u=1;u<s;u++)
							{
								if(D[u]>B)
								{
									//System.out.println(D[u]);
									//df=D[u];
									if(ts.add(u))
									{
										max++;
										break;
									}
								}
							}
						}
					}	
					System.out.println(max);
				}
				
			}
		}
	}
}