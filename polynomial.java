import java.util.Scanner;
import java.math.*;
class polynomial
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		BigInteger bg=new BigInteger("9999999999999999999999");
		BigInteger sum=new BigInteger("0");
		for(i=0;i<=t;i++)
		{
			Long h=scan.nextLong();
			sum=sum.add(BigInteger.valueOf(h).multiply(bg.pow(i)));
		}
		if(sum.compareTo(new BigInteger("0"))>0)
		{
			System.out.println("1"+" "+"-1");
		}
		else if(sum.compareTo(new BigInteger("0"))==0)
		{
			System.out.println("0"+" "+"0");
		}
		else
		{
			System.out.println("-1"+" "+"1");
		}
	}
}