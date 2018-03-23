import java.util.Scanner;
import java.math.*;
class abrepeat
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b,t,i,j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			String str=scan.next();
			for(int y=0;y<b;y++)
			{
				str=str.concat(str);
			}
			char A[]=str.toCharArray();
			BigInteger k=new BigInteger("0");
			BigInteger p=new BigInteger("1");
			for(j=a*b-1;j>=0;j--)
			{
				if(A[j]=='b')
				{
					for(l=0;l<j;l++)
					{
						if(A[l]=='a')
						{
							k=k.add(p);
						}
					}
				}
			}
			System.out.println(k);
		}
	}
}