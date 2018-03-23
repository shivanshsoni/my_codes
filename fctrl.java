import java.util.Scanner;
import java.math.*;
class fctrl
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
				l=0;
				BigInteger bg=new BigInteger("10");
				for(j=1;j<=b;j++)
				{
					res=res.multiply(BigInteger.valueOf(j));
					if(res.mod(bg).equals(BigInteger.ZERO))
					{
						l++;
						res=res.divide(bg);
					}
				}
				System.out.println(l);
				
			}
	}
} 