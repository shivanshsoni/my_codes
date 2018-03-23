import java.util.Scanner;
public class prob1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,k,i,j,l;
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		if(m%n!=0&&k!=1&&k!=n)
		{
			if(m%n>=3)
				
			System.out.println(m/n+1);
		}
		if(m%n!=0&&k==1 || m%n!=0&&k==n)
		{
			if(m%n==1)
			{
				System.out.println(m/n+1);
			}
			else
			{
				System.out.println(m/n+2);
			}
		}
		if(m%n==0&&k!=1&&k!=n)
		{
			System.out.println(m/n);
		}
		if(m%n==0&&k==1 || m%n==0&&k==n)
		{
			System.out.println(m/n+1);
		}
	}
}