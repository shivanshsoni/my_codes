import java.util.Scanner;
import java.util.Arrays;
class districtcount
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			int x=scan.nextInt();
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int m=0;
			for(k=0;k<n-1;k++)
			{
				if(A[k]!=A[k+1])
				{
					m++;
				}
			}
			if(m+1>x)
			{
				System.out.println("Average");
			}
			else if(m+1<x)
			{
				System.out.println("Bad");
			}
			else
			{
				System.out.println("Good");
			}
		}
	}
}