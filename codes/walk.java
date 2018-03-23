import java.util.Scanner;
import java.util.Arrays;
class walk
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				B[j]=A[j];
			}
			Arrays.sort(A);
			l=0;
			for(k=0;k<n;k++)
			{
				if(	B[k]==A[n-1])
				{
					l=k;
					break;
				}
			}
			if(A[n-1]>=n)
			System.out.println(A[n-1]+l);
			else
				System.out.println(n+B[n-1]-1);
		}
	}
}