import java.util.Scanner;
class obtusetriangle
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
			if((k%2==0&&a-b==k/2)||(k%2==0&&b-a==k/2))
			{
				System.out.println("0");
			}
			else
			{
				if(b>a)
				{
					j=b-a-1;
					l=k-(b-a-1)-2;
					if(j<l)
					{
						System.out.println(j);
					}
					else if(l<j)
					{
						System.out.println(l);
					}
					else
					{
						System.out.println("0");
					}
				}
				else
				{
					j=a-b-1;
					l=k-(a-b-1)-2;
					if(j<l)
					{
						System.out.println(j);
					}
					else if(l<j)
					{
						System.out.println(l);
					}
					else
					{
						System.out.println("0");
					}
				}
			}
		}
	}
}