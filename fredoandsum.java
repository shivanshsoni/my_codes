import java.util.Scanner;
import java.util.Arrays;
class fredoandsum
{
	public static void main(STring[]args)
	{
		Scanner Scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			Long sum1=0L;
			Long sum2=0L;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int p=n-1;
			for(k=0;k<n/2;k++)
			{
				sum1=sum1+A[p]-A[k]
				p--;
			}
			for(l=0;l<n-1;l++)
			{
				sum2=sum2+A[l+1]-A[l];
			}
			System.out.println(sum2+" "+sum1);
		}
	}
}