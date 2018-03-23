import java.util.Scanner;
class coinflip
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,a,b,c,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			for(j=0;j<n;j++)
			{	
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a==1&&c==1)
			{
				System.out.println(b/2);
			}
			if(a==1&&c==2)
			{
				if(b%2!=0)
				System.out.println(b/2+1);
				else
					System.out.println(b/2);
			}
			if(a==2&&c==1)
			{
				if(b%2!=0)
				System.out.println(b/2+1);
				else
				{
					System.out.println(b/2);
				}
			}
			if(a==2&&c==2)
			{
				System.out.println(b/2);
			}
			}
		}
	}
}