import java.util.Scanner;
class chefdogs
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,l,i,j,k,p;
		float c,d;
		t=scan.nextInt();
		p=0;
		for(i=0;i<t;i++)
		{
			c=scan.nextInt();
			d=scan.nextInt();
			l=scan.nextInt();
			if(d>=c/2 )
			{
				p=(int)d;
			}
			else if(c==0||d==0)
			{
				if(c==0)
				{
					p=(int)d;
				}
				else
				{
					p=(int)c;
				}
			}
			else
			{
				p=(int)(d+c-2*d);
			}
			//System.out.println(p);
			if(l%4!=0)
			{
				System.out.println("no");
			}
			else
			{
				
				if(l<=(c+d)*4 && l>=4*p && c!=0&& d!=0)
				{
					System.out.println("yes");
				}					
				else if(d==0 || c==0)
				{
					if(l==4*p)
					{
						System.out.println("yes");
					}
					else
					{
						System.out.println("no");
					}
				}

				else
				{
					System.out.println("no");
				}
			}
		}
	}
}