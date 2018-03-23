import java.util.Scanner;
import java.util.Arrays;
class chefa
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		int a,b;
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
			a=0;
			b=0;
			for(k=n-1;k>=0;k=k-2)
			{
				a=a+A[k];
			}
			for(l=n-2;l>=0;l=l-2)
			{
				b=b+A[l];
			}
			System.out.println(a);
		}
	}
}