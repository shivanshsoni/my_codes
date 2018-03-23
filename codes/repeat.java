import java.util.Scanner;
class repeat
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int m,k,l;
		long n,i,j;
		n=scan.nextLong();
		long h=n*n;
		long A[]=new long[h];
		k=0;
		for(i=1;i<=n;i++)
		{
			for(j=n+1;j<=2*n;j++)
			{
				A[k]=i+j;
				k++;
			}
		}
		m=scan.nextInt();
		for(l=0;l<m;l++)
		{	
			int t=0;
			int p=scan.nextInt();
			for(int y=0;y<k;y++)
			{
				if(A[y]==p)
				{
					t++;
				}
			}
			System.out.println(t);
		}
	}
}