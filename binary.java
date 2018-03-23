import java.util.Scanner;
class binary
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			if(n<=3)
			{
				System.out.println(n+1);
			}
			else
			{
				System.out.println(n+n*(n-1));
			}
		}
	}
}