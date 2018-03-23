import java.util.Scanner;
class chefnil
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		for(i=0;i<t*n;i++)
		{
			for(j=0;j<t;j++)
			{
				int a=scan.nextInt();
			}
		}
		int p=1;
		for(i=1;i<=n;i=i+2)
		{
					System.out.println(p+" "+"1");
					System.out.println(p+" "+"2")
					p++;
					if(p>=t)
					{
						break;
					}
		}
	}
}