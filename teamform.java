import java.util.Scanner;
class teamform
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			for(j=0;j<b;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
			}
			if((a-2*b)%2==0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}