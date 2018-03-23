import java.util.Scanner;
class icpc16b
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			System.out.println(n%9+1);
		}
	}
}