import java.util.Scanner;
public class sashasticks
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		Long t,i,j,k,l;
		t=scan.nextLong();
		i=scan.nextLong();
		if((t/i)%2==0)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}