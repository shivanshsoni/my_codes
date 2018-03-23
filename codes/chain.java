import java.util.Scanner;
class chain
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int m=0;
			for(j=0;j<k;j++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				if(a==1)
				{
					if(b>n||c>n)
					{
						m++;
					}
					else if(a!=b)
					{
						m++;
					}
				}
				else
				{
					if(b>n||c>n)
					{
						m++;
					}
					else if(a==b)
					{
						m++;
					}
				}
			}
			System.out.println(m);
		}
	}
}