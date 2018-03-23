import java.util.Scanner;
class icpc16a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int d=scan.nextInt();
			if(a==c&&b<d)
			{
				System.out.println("up");
			}
			else if(a==c&&b>d)
			{
				System.out.println("down");
			}
			else if(b==d&&a<c)
			{
				System.out.println("right");
			}
			else if(b==d&&a>c)
			{
				System.out.println("left");
			}
			else
			{
				System.out.println("sad");
			}
		}
	}
}