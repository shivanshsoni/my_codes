import java.util.Scanner;
class array1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(b-a%c==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}