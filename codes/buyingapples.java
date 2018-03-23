import java.util.Scanner;
import java.util.Arrays;
class spoj
{
	public static void main(string[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,k,i,j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int m=0;
			for(l=0;l<n;l++)
			{
				if(n%(l+1)==0)
				{
					B[m]=A[l]*n/l;
					m++;
				}
			}
			Arrays.sort(B);
			System.out.println(B[0]);
		}
	}
}