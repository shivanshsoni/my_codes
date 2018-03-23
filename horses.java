import java.util.Scanner;
import java.util.Arrays;
class horses
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			for(k=1;k<n;k++)
			{
				B[k-1]=A[k]-A[k-1];
			}
			Arrays.sort(B);
			
			System.out.println(B[1]);
		}
	}
}