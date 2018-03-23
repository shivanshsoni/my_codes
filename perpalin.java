import java.util.Scanner;
class perpalin
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
			if(a==1||b==1||a==2||b==2)
			{
				System.out.println("impossible");
			}
			else if(a==b)
			{
				StringBuilder str=new StringBuilder("");
				for(j=0;j<a;j++)
				{
					if(j==0||j==a-1)
					{
						str.append("a");
					}
					else
					{
						str.append("b");
					}
				}
				System.out.println(str.toString());
			}
			else
			{
				StringBuilder str=new StringBuilder("");
				for(j=0;j<a;j++)
				{
					if(j%b==0)
					{
						str.append("a");
					}
					else
					{
						if((j+1)%b==0)
						{
							str.append("a");
						}
						else
						{
							str.append("b");
						}
					}
				}
				String mtr=str.reverse().toString();
				//System.out.println(mtr);
				if(mtr.equals(str.toString()))
				{
					System.out.println(str.toString());
				}
				else
				{
					System.out.println("impossible");
				}
			}
		}
	}
}