import java.util.Scanner;
class chefandthepatent
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int d=scan.nextInt();
			String str=scan.next();
			char A[]=str.toCharArray();
			int m=0;
			int n=0;
			for(j=0;j<d;j++)
			{
				if(A[j]=='E')
				{
					m++;
				}
				else
				{
					n++;
				}
			}
			int sum=0;
			for(l=1;l<=b;l++)
			{
				if(l%2==0)
				{
					if(c>m)
					{
						sum=sum+m;
						m=0;
					}
					else
					{
						sum=sum+c;
						m=m-c;
					}
				}
				else
				{
					if(c>n)
					{
						sum=sum+n;
						n=0;
					}
					else
					{
						sum=sum+c;
						n=n-c;
					}
				}
				if(sum>=a)
				{
					break;
				}
			}
			if(sum>=a)
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