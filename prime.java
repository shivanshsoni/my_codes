import java.util.Scanner;
class prime
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			l=scan.nextInt();
			for(j=k;j<=l;j++)
			{
				if(j>=8)
				{
					if(j%2==0||j%3==0||j%5==0||j%7==0)
					{

					}
					else
					{
							System.out.println(j);
					}
				}
				if(j==2||j==3||j==5||j==7)
				{
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
}