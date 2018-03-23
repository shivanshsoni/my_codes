import java.util.Scanner;
class primew
{
	public static void main(String[]arsg)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		l=scan.nextInt();
		for(i=0;i<l;i++)
		{
			k=scan.nextInt();
			t=0;
			if(k==2||k==3)
			{
				t=1;
			}
			if(k>=4)
			{
				for(int y=2;y<k/2;y++)
				{
					if(k%y==0)
					{
						t=1;
						break;
					}
				}
			}
			if(t==1)
			{
			System.out.println("prime");
			}
			else
			{
			System.out.println("not");
			}
		}
	}
}
