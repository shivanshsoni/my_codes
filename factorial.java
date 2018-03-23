import java.util.Scanner;
import java.math.*;
class factorial
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,d,n,i,j,k,l;
		BigInteger a,b,c;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			a=new BigInteger("1");
			for(j=1;j<=n;j++)
			{
				a=a.multiply(BigInteger.valueOf(j));
			}
			b=new BigInteger("1");
			d=scan.nextInt();
			for(k=1;k<=d;k++)
			{
				b=b.multiply(BigInteger.valueOf(k));
			}
			c=new BigInteger("1");
			for(l=1;l<=n-d;l++)
			{
				c=c.multiply(BigInteger.valueOf(l));
			}
			System.out.println(a.divide((b.multiply(c))));
		}
	}
}