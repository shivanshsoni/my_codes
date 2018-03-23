import java.util.Scanner;
import java.math.BigInteger;
class nuff
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i;
		n=scan.nextInt();
		BigInteger k=BigInteger.valueOf(0);
		BigInteger j=BigInteger.valueOf(0);
		for(i=0;i<n-1;i++)
		{
			j=scan.nextBigInteger();
			k=k.add(j);
		}
		BigInteger l=BigInteger.valueOf(n*(n+1)/2);
		System.out.println(l.subtract(k));
	}
}