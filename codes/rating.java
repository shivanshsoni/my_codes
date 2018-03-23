import java.util.Scanner;
class rating
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,k,i,j,l;
		t=scan.nextInt();
		k=0;
		l=0;
		n=0;
		j=0;
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			l=k+n;
			if(k==1)
			{
				j++;
			}
			else
			{
				j--;
			}
		}
		if(k==1&&l>0&&j!=n)
		{
			System.out.println(1901+l);
		}
		else if(k==2&&l>0&&j!=n)
		{
			System.out.println("Impossible");
		}
		else if(j==n)
		{
			System.out.println("Infinity");
		}
		else
		{
			System.out.println(1899-l);
		}
	}
}