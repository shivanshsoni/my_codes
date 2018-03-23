import java.util.Scanner;
import java.util.Arrays;
class code154
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int m=0;
			for(l=1;l<=k;l++)
			{
				if(A[l-1]==l)
				{

				}
				else
				{
					m++;
				}
			}
			System.out.println(m);
		}
	}
}