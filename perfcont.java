import java.util.Scanner;
class perfcont
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int m=0;
			int p=0;
			for(j=0;j<a;j++)
			{
				k=scan.nextInt();
				if(k>=b/2)
				{
					m++;
				}
				if(k<=b/10)
				{
					p++;
				}
			}
			if(p==2&&m==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}