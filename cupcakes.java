import java.util.Scanner;
class cupcakes
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			l=0;
			for(j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					A[l]=j;
					l++;
				}
			}
			int p=1;
			Double k=Math.sqrt(n);
			for(int y=0;y<l;y++)
			{
				if(A[y]<=k)
				{
					p=A[y];
				}
			}
			System.out.println(n/p-p);
		}
	}
}