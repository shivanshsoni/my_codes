import java.util.Scanner;
import java.util.Arrays;
class array3
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				B[j]=A[j];
			}
			Arrays.sort(A);
			int max=0;
			l=0;
			for(k=0;k<n;k++)
			{
				int m=0;
				int p=0;
				while(A[m]!=B[k])
				{
					p++;
					m++;
				}
				int y=p*(k+1);
				if(max<y)
				{
					max=y;
					l=k+1;
				}
			}
			System.out.println(l);
		}
	}
}