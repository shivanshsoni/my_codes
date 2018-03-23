import java.util.Scanner;
class cook85b
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a-b==k/2||b-a==k/2||a-b==1||b-a==1)
			{
				System.out.println("0");
			}
			else
			{
				if(b>a&&b-a>k/2)
				{

					System.out.println(k-b+a-1);
				}
				if(b>a&&b-a<k/2)
				{
					System.out.println(b-a-1);
				}
				if(a>b&&a-b<k/2)
				{
					System.out.println(a-b-1);
				}
				if(a>b&&a-b>k/2)
				{
					System.out.println(k=a+b-1);
				}
			}
		}
	}
}