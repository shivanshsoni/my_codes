import java.util.Scanner;
import java.math.*;
class smallfactorial
{
	public static void main(String[]args)
	{
			Scanner scan=new Scanner(System.in);
			
			int a,c,i,k,l,b,j;
			a=scan.nextInt();
			for(i=1;i<=a;i++)
			{
				BigInteger res=new BigInteger("1");
				b=scan.nextInt();
				for(j=1;j<=b;j++)
				{
					res=res.multiply(BigInteger.valueOf(j));
				}
				System.out.println(res);
			}
	}
} 