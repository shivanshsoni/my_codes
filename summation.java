import java.util.Scanner;
import java.math.*;
class summation
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			Long A[]=new Long[n];
			BigInteger sum=new BigInteger("0");
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
				sum=sum.add(BigInteger.valueOf(A[j]));
			}
			BigInteger bi=new BigInteger("1");
			for(k=0;k<n-1;k++)
			{
				bi=bi.multiply(BigInteger.valueOf(2));
			}
			sum=sum.multiply(bi);
			System.out.println("Case "+(i+1)+": "+sum.mod(BigInteger.valueOf(100000007)));
		}
	}
}