import java.util.Scanner;
class he2
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
			l=0;
			int p=0;
			for(j=2;j<=n;j++)
			{
				p=1;
				for(k=2;k<=j/2;k++)
				{
					if(j%k==0)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					A[l]=j;
					l++;
				}
			}
			p=0;
			for(int a=0;a<l;a++)
			{
				for(int b=0;b<l;b++)
				{
					if(A[a]+A[b]==n&&a!=b)
					{
						p=1;
						break;
					}
				}
				if(p==1)
				{
					break;
				}
			}
			if(p==1)
			{
			System.out.println("Deepa");
			}
			else
			{
			System.out.println("Arjit");
			}
		}
	}
}