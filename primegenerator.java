import java.util.Scanner;
class primegenerator
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,a,b,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			for(j=a;j<=b;j++)
			{
				for(k=2;k<j;k++)
				{
					if(j%k!=0)
					{
						System.out.println(j);
						break;
					}
				}
			}
			System.out.println("");
		}
	}
}