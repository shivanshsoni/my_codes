import java.util.Scanner;
class gcd1
{
	public static void main(String[]arfs)
	{
		Scanner scan=new Scanner(System.in);
		int l,r,g,i,j,k;
		l=scan.nextInt();
		r=scan.nextInt();
		g=scan.nextInt();
		int a=0;
		for(i=l;i<=r;i++)
		{
			for(j=l;j<=r;j++)
			{
				int m=0;
				for(k=1;k<=i&&k<=j;k++)
				{
					if(i%k==0&&j%k==0)
					{
						m=k;
					}
				}
				if(m==g)
				{
					a++;
				}
			}
		}
		System.out.println(a);
	}
}