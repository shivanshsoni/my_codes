import java.util.Scanner;
import java.util.Arrays;
class mxmedian
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[2*n];
			for(j=0;j<2*n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int B[]=new int[2*n];
			B[0]=A[0];
			B[2*n-1]=A[2*n-1];
			for(k=1;k<=2*n-2;k=k+2)
			{
				if(A[k]>=A[k+1])
				{
					B[k]=A[k];
					B[k+1]=A[k+1];
				}
				if(A[k]<A[k+1])
				{
					B[k]=A[k+1];
					B[k+1]=A[k];
				}
			}
			if(B[n]>=B[n-1])
			{
				System.out.println(B[n]);
			}
			else
			{
				System.out.println(B[n-1]);
			}
			for(l=0;l<2*n;l++)
			{
				System.out.printf("%d ",B[l]);
			}
			System.out.printf("\n");
		}
	}
}