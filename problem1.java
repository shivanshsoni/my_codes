import java.util.Scanner;
import java.math.*;
class problem1
{
	public static void main(String[]atrgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			BigInteger ans=new BigInteger("1");
			int p=2;
			k=scan.nextInt();
			if(k%2==0)
			{
				ans=ans.multiply(BigInteger.valueOf(k));

				ans=ans.multiply(BigInteger.valueOf(k));

				ans=ans.multiply(BigInteger.valueOf(p));
			}
			else
			{
				ans=ans.multiply(BigInteger.valueOf(k));

				ans=ans.multiply(BigInteger.valueOf(k));
			}
			System.out.println(ans);
		}
	}
}