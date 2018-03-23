import java.util.Scanner;
class apgp
{
	public static void main(String[]atdg)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b,c;
		a=-1;
		b=-1;
		c=-1;
		while(a!=0&&b!=0&&c!=0)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a==0&&b==0&&c==0)
			{
				System.out.println("");
			}
			else if(a-b==b-c)
				{
					System.out.printf("AP %d\n",c+c-b);
				}
			else
			{
				System.out.printf("GP %d\n",c*(b/a));
			}
		}
	}
}