import java.util.Scanner;
import java.util.Arrays;
class trianglenit
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,a,b,c,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			l=0;
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a>b&&a>c)
			{
				l=a;
			}
			if(b>a&&b>c)
			{
				l=b;
			}
			if(c>a&&c>b)
			{
				l=c;
			}
			if(a+b+c-l>l)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}