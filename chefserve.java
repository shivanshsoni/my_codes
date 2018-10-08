import java.util.Scanner;
class chefserve
{
	public static void main(String[]rgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int a=scan.nextInt();
		int b=scan.nextInt();
		t=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		int g=0;
		int p=0;
		for(i=0;i<t;i++)
		{
			p=0;
			while(p<A[i])
			{
				p=p+a;
				g++;
				if(p>=A[i])
				{
					break;
				}
				p=p-b;
			}
			//System.out.println(g);
		}
		//System.out.println(g);
		if(g%5==0)
		{
			g=g/5;
		}
		else
		{
			g=g/5 +1;
		}
		System.out.println(40*8*t-g*7+".0");
	}
}
