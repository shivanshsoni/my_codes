import java.util.Scanner;
class coins
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		for(i=0;i<=10;i++)
		{
			if(i==10)
			{
				break;
			}
			
			n=scan.nextInt();
			k=n/2+n/3+n/4;
			
			if(k>=n)
			{
				System.out.println(k);
			}
			else
			{
				System.out.println(n);
			}

		}
	}
}