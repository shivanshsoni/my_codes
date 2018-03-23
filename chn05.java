import java.util.Scanner;
class chn05
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
			if(a==2)
			{
				System.out.println(b);
			}
			if(a>2)
			{
				System.out.println(a-1+2*(b-1));
			}
			if(a==1)
			{
				System.out.println("0");
			}
		}
	}
}