import java.util.Scanner;
class leftorright
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<n;j++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			char ch=scan.next().charAt(0);
			int m=0;
			int p=0;
			if(ch=='R')
			{
				for(i=a;i<a+t;i++)
				{	
					if(A[i%t]==b)
					{
						break;
					}
					else
					{
						m++;
					}
				}
				if(m==t)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(m);
				}
			}
			else
			{
				for(i=a+t;i>a;i--)
				{	
					if(A[i%t]==b)
					{
						break;
					}
					else
					{
						m++;
					}
				}
				if(m==t)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(m);
				}
			}
		}
	}
}