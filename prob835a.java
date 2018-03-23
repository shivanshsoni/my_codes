import java.util.Scanner;
public class prob835a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		if(2*c+t*a<2*d+t*b)
		{
			System.out.println("First");
		}
		if(2*c+t*a>2*d+t*b)
		{
			System.out.println("Second");
		}
		if(2*c+t*a==2*d+t*b)
		{
			System.out.println("Friendship");
		}
	}
}