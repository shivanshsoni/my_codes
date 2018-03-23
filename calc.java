import java.util.Scanner;
class calc
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,k;
		long j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			k=0;
			l=0;
			j=0;
			if(a/b==1)
			{
				System.out.println(a-b);
			}
			else if(a<b)
			{
				System.out.println("0");
			}
			else
			{
				k=a/(b+1);
				l=a-(b*k);
				j=l*k;
				System.out.println(j);
			}
		}
	}
}