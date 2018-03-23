import java.util.Scanner;
class hackerearth1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,p;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			l=1;
			n=scan.nextInt();
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					p=0;
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
						l=j;
					}
				}
			}
			System.out.println(l);
		}
	}
}