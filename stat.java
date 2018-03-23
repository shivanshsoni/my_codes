import java.util.Scanner;
class stat
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			if(n>500000000)
			{
				System.out.println("-1");
			}
			else
			{
				int a=0;
				int b=0;
				if(n%2!=0)
				{
					a=n-(n/2);
					b=n+n/2;
				}
				else
				{
					a=n/2+1;
					b=n+n/2;
				}
				for(k=a;k<=b;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println("");
			}

		}
	}
}