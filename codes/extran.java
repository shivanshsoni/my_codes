import java.util.Scanner;
import java.util.Arrays;
class extran
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
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int p=-1;
			for(l=0;l<n-1;l++)
			{
				if(A[l+1]-A[l]==0)
				{
					p=A[l];
					break;
				}
			}
			if(p!=-1)
			{
				System.out.println(A[l]);
			}
			else
			{
				if(A[1]-A[0]!=1)
				{
					System.out.println(A[0]);
				}
				else
				{
					System.out.println(A[n-1]);
				}
			}
		}
	}
}