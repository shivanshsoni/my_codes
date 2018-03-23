import java.util.Scanner;
import java.util.Arrays;
class csubq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int q=scan.nextInt();
		l=scan.nextInt();
		int r=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		Arrays.fill(A,0);
		Arrays.fill(B,0);
		for(i=0;i<q;i++)
		{
			k=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(k==1)
			{
				A[a-1]=b;
			}
			else
			{
				int m=0;
				int p=0;
				int n=0;
				int prev=0;
				for(int g=b-1;g>=a-1;g--)
				{
					if(A[g]>=l&&A[g]<=r)
					{
						p++;
						B[g]=p;
						n++;
						prev=p;
					}
					if(A[g]<l)
					{
						if(n==0)
						{
							B[g]=0;
						}
						else
						{
							B[g]=prev;
						}
						p++;
					}
					if(A[g]>r)
					{
						p=0;
						n=0;
						prev=0;
						B[g]=0;
					}
					m=m+B[g];
				}
				System.out.println(m);
			}
		}
	}
} 