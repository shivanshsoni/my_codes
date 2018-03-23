import java.util.Scanner;
public class code898a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		if(t%10==0)
		{
			System.out.println(t);	
		}
		else if(t%10<=5)
		{
			System.out.println(t-(t%10));
		}
		else
		{
			System.out.println(t-(t%10)+10);
		}
	}
}