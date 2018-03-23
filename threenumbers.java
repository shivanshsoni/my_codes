import java.util.Scanner;
import java.math.*;
class threenumbers
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
			int m=0;
			BigInteger n=new BigInteger("1");
			while(m!=c)
			{
				if(n.mod(BigInteger.valueOf(a)).equals(0)||n.mod(BigInteger.valueOf(b)).equals(0))
				{
					m++;
					if(m==c)
					{
						break;
					}
				}
				n=n.add(BigInteger.valueOf(1));
			}
			System.out.println(n);
		}
	}
}