import java.util.Scanner;
class bot
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a,b,c,d;
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			d=scan.nextInt();
			if(c>=4&&d>=4&&a-c>=4&&b-d>=4)
			{
				System.out.println("Shivam");
			}
			else
			{
				System.out.println("Mavis");
			}
		}
	}
}