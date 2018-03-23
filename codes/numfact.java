import java.util.Scanner;
class numfact
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,j,k,l,a,c;
		int  d,b;
		t=scan.nextInt();
		for(j=0;j<t;j++)
		{
			n=scan.nextInt();
			d=1;
			for(k=0;k<n;k++)
			{
				a=scan.nextInt();
				d=d*a;
			}
			c=0;
			
			//{
				for(b=1;b<d;b++)
				{
					if(d%b==0)
					{
			//			d=d/b;
						c++;
					}
				}
				System.out.println(c);
		//	}
		}
	}
}