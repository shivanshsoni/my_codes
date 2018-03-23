import java.util.Scanner;
import java.util.Arrays;
class maxdifference
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,k,i,j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			int s=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				s=s+A[j];
			}
			Arrays.sort(A);
			int m=0;
			for(l=0;l<k;l++)
			{
				m=m+A[l];
			}
			
			System.out.println(s-2*m);
		}
	}
}