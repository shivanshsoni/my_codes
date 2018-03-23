import java.util.Scanner;
class calc1
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
			int p=b;
			for(int y=0;y<a/b;y++)
			{
				k=a-p;
				l=(p/b)*k;
				p=p+b;
				if(j<l)
				{
					j=l;
				}
			}
			System.out.println(j);
		}
	}
} 