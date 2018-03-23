import java.util.Scanner;
class bennyandsum
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,l,r,x,i,j,k;
		n=scan.nextInt();
		m=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<m;j++)
		{
			int s=0;
			l=scan.nextInt();
			r=scan.nextInt();
			x=scan.nextInt();
			for(k=l-1;k<=r-1;k++)
			{
				s=s+A[k]%x;
			}
			System.out.println(s);
		}
	}
}