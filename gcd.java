import java.util.Scanner;
import java.math.*;
class gcd
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,j,k,l;
		int b;
		int t,i;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextBigInteger();
			for(j=1;j<=a&&j<=b;j++)
			{
				if(a%j==0&&b%j==0)
				{
					l=j;
				}
			}
			System.out.println(l);
		}
	}
}