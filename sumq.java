import java.util.Scanner;
import java.math.*;
class sumq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int p=scan.nextInt();
			int q=scan.nextInt();
			int r=scan.nextInt();
			int A[]=new int[p];
			int B[]=new int[q];
			int C[]=new int[r];
			for(j=0;j<p;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<q;k++)
			{
				B[k]=scan.nextInt();
			}
			for(l=0;l<r;l++)
			{
				C[l]=scan.nextInt();
			}
			BigInteger sum=new BigInteger("0");
			Long s=0L;
			for(int a=0;a<p;a++)
			{
				for(int b=0;b<q;b++)
				{
					for(int c=0;c<r;c++)
					{
						if(B[b]>=A[a]&&B[b]>=C[c])
						{
							Long v=new Long(A[a]);
							Long n=new Long(B[b]);
							Long m=new Long(C[c]);
							s=(v+n)*(n+m);
							sum=sum.add(BigInteger.valueOf(s));
						}
					}
				}
			}
			System.out.println(sum.mod(new BigInteger("1000000007")));
		}
	}
} 