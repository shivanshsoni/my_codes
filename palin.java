import java.util.Scanner;
import java.math.*;
public class palin
{
	public static void main(String[]arfgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j;
		BigInteger k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextBigInteger();
			BigInteger f=new BigInteger("10");
			if(k<=f)
			{
				System.out.println("11");
			}
			else
			{
			k.equals(k.add(BigInteger.valueOf(1)));
			BigInteger reverse=new BigInteger(0);
			while(true)
			{
				reverse.equals(0);
				BigInteger w=new BigInteger(0);
				l=k;
				while(l!=w)
				{
					reverse.equals(reverse.multiply(10));
					reverse.equals(reverse.add(l.mod(f)));
					l.equals(l.divide(10));
				}
				if(reverse==k)
				{
					System.out.println(reverse);
					break;
				}
				k++;
			}
		}
	}
}
}