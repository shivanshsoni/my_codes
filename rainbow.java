import java.util.Scanner;
class rainbow
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int m=0;
			int p=0;
			int y=n-1;
			for(j=0;j<n;j++)
			{
				if(j<=n/2&&j>0)
				{
					if(A[j]-A[j-1]==0||A[j]-A[j-1]==1)
					{
						if(A[j]-A[j-1]==1)
						{
							m++;
						}
					}
				}
				if(A[j]!=A[y])
				{
					p=1;
				}
				y--;
			}
			if(m==6&&A[0]==1&&A[n/2]==7&&n>12&&p==0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}