import java.util.Scanner;
public class code900A
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int a=0;
		int b=0;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			l=scan.nextInt();
			if(k<0)
			{
				a++;
			}
			if(k>0)
			{
				b++;
			}	
		}
		if(a<=1||b<=1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}