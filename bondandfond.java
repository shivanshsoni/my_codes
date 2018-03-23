import java.util.Scanner;
import java.*;
import java.util.*;
class bondandfond
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			Double n=scan.nextDouble();
			int N=(int) Math.round(n);
			Double l=Math.log(n)/Math.log(2);
			int o=(int) Math.round(l);
			Long a=(new Double(Math.pow(2,o))).longValue();
			Long b=a/2L;
			if(a-N<=N-b)
			{
				System.out.println(a-N);
			}
			else
			{
				System.out.println(N-b);
			}
		}
	}
}