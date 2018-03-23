import java.util.Scanner;
public class kthdivisor
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int k,j,l;
		long n,i;
		n=scan.nextLong();
		k=scan.nextInt();
		l=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				l++;
			}
			if(l==k)
			{
				System.out.println(i);
				break;
			}
		}
		if(k>l)
		{
			System.out.println("-1");
		}
	}
} 