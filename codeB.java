import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
public class codeB
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i,j,k,l;
		Long A[]=new Long[3];
		Long B[]=new Long[n];
		for(i=0;i<3;i++)
		{
			A[i]=scan.nextLong();
		}
		Arrays.sort(A);
		for(j=0;j<n;j++)
		{
			B[j]=scan.nextLong();
		}
		Arrays.sort(B);
		BigInteger sum=new BigInteger("0");
		for(k=0;k<3;k++)
		{
			if(A[k]<=0)
			{
				sum=sum.add(BigInteger.valueOf(A[k]*B[0]));
			}
			else
			{
				sum=sum.add(BigInteger.valueOf(A[k]*B[n-1]));
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}