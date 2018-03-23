import java.util.Scanner;
import java.math.*;
import java.util.*;
import java.*;
class prmq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		int q=scan.nextInt();
		for(j=0;j<q;j++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int d=scan.nextInt();
			int sum=0;
			for(k=c;k<=d;k++)
			{
				int t=0;
				for(int y=2;y<=k/2;y++)
				{
					if(k%y==0)
					{
						t=1;
						break;
					}
				}
				if(t==0)
				{
					for(l=a-1;l<=b-1;l++)
					{
						int e=0;
						int num=A[l];
						while(num%k==0)
						{
							e=e+1;
							num=num/k;
						}
						sum=sum+e;
					}
				}
			}
			System.out.println(sum);
		}
	}
}