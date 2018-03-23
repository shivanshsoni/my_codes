import java.util.Scanner;
import java.math.*;
class prac24
{
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
			int A[]=new int[n];
			BigInteger C[]=new BigInteger[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				if(j==0)
				{
					C[j]=BigInteger.valueOf(A[j]);
				}
				else
				{
					C[j]=C[j-1].multiply(BigInteger.valueOf(A[j]));
				}
				//System.out.println(C[j]);
			}
			for(l=0;l<q;l++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				if(a==0)
				{
					System.out.println(C[b]);
				}
				else
				{
					System.out.println(C[b].divide(C[a]));
				}
			}
		}
	}
} 