import java.util.Scanner;
class range
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,q,i,j,k,l,r;
		long sum;
		n=scan.nextInt();
		q=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<q;j++)
		{
			sum=0L;
			l=scan.nextInt();
			r=scan.nextInt();
			for(k=l-1;k<=r-1;k++)
			{
				sum=sum+A[k];
			}
			System.out.println(sum);
		}
	}
}