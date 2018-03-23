import java.util.Scanner;
public class code898b
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int m=0;
		int n=0;
		int p=0;
		while(t>0)
		{
			if(t%b!=0)
			{
				t=t-a;
				m++;
			}
			else
			{
				n=t/b;
				p=1;
				break;
			}
			if(t==0)
			{
				p=1;
				break;
			}
		}
		if(p==1)
		{
			System.out.println("YES");
			System.out.println(m+" "+n);
		}
		else
		{
			System.out.println("NO");
		}
	}
}