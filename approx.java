import java.util.Scanner;
class approx
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,i,j,k,l;
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[n];
		int sum=0;
		for(int y=0;y<n;y++)
		{
			A[y]=scan.nextInt();
		}
		for(i=1;i<=m;i++)
		{
			l=0;
			for(j=0;j<n;j++)
			{
				if(A[j]==i)
				{
					l++;
				}
			}
			if(l>k)
			{
				sum=sum+l-k;
			}
		}
		System.out.println(sum);
	}
}