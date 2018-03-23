import java.util.Scanner;
import java.util.Arrays;
class kingship
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		long sum;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			//System.out.println(A[0]);
			//System.out.println(A[1]);
			sum=0L;
			for(k=1;k<n;k++)
			{
				sum=sum+A[0]*A[k];
			//	System.out.println(sum);
			}
			System.out.println(sum);
		}
	}
}