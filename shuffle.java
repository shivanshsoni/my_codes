import java.util.Scanner;
import java.math.*;
class shuffle
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			BigInteger k=scan.nextBigInteger();
			int l=0;
			String str=k.toString(2);
			l=n-str.length();
			StringBuilder ptr=new StringBuilder("");
			for(int a=0;a<l;a++)
			{
				ptr=ptr.append("0");
			}
			ptr.append(str);
			String htr=ptr.reverse().toString();
			BigInteger y=new BigInteger(htr,2);
			System.out.println(y);
		}
	}
}