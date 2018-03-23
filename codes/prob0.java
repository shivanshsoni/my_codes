import java.util.Scanner;
public class prob0
{
	public static void main(String[]arfs)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,i,j,k,l;
		n=scan.nextInt();
		m=scan.nextInt();
		if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
		{
			if(m==7||m==6)
			{
				System.out.println("6");
			}
			else
			{
				System.out.println("5");
			}
		}
		else if(n==2)
		{
			if(m==1)
			{
				System.out.println("4");
			}
			else
			{
				System.out.println("5");
			}
		}
		else
		{
			if(m==7)
			{
				System.out.println("6");
			}
			else
			{
				System.out.println("5");
			}
		}
	}
}