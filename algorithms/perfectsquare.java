import java.util.Scanner;
class perfectsquare
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
		int number=scan.nextInt();
		int f=number;
		int sum=0;
		for(int i=1;i<=Math.sqrt(number)+2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==f&&f!=1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
	}
}