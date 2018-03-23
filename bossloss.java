import java.util.Scanner;
class bossloss
{
	public static void main(String[]atsh)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			Long n=scan.nextLong();
			Long m=scan.nextLong();
			Long d;
			int p=0;
			Long h=0L;
			for(h=1L;h<=n;h++)
			{
				d=h*(h+1L)/2;
				if(d>=m)
				{
					p=1;
					break;
				}
			}
			if(p==1)
			{
				System.out.println(h);
			}
			else
			{
				System.out.println("-1");
			}
		}
	}
}