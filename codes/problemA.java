import java.util.Scanner;
public class problemA
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b,i,j,k,l;
		a=scan.nextInt();
		b=scan.nextInt();
		if(a-b==1||b-a==1||a-b==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}