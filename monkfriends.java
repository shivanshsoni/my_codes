import java.util.Scanner;
class monkfriends
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			Long A[]=new Long[m+n];
			for(j=0;j<m+n;j++)
			{
				A[j]=scan.nextLong();
			}
			int a=0;
			for(k=n;k<n+m;k++)
			{
				int p=0;
				for(l=0;l<n+a;l++)
				{
					if(A[k]==A[l])
					{
						p=1;
					}
				}
				a++;
				if(p==1)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
			}
		}
	}
}