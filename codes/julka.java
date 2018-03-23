import java.util.Scanner;
import java.math.BigInteger;
class julka
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		BigInteger n,k,j,l;
		int i;
		j=BigInteger.valueOf(0);
		l=BigInteger.valueOf(0);
		for(i=0;i<10;i++)
		{
			n=scan.nextBigInteger();
			k=scan.nextBigInteger();
			BigInteger m=BigInteger.valueOf(2);
			//System.out.println(m);
			j=(n.subtract(k)).divide(m);
			l=(n.add(k)).divide(m);
			int res=j.compareTo(l);
			if(res==0||res==-1)
			{
				System.out.println(l);
				System.out.println(j);
			}
			else
			{
				System.out.println(j);
				System.out.println(l);
			}
		}
	}
}