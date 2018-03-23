import java.util.Scanner;
public class shivansh
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			if(k%3==0||k%7==0)
			{
				System.out.println("YES");
			}
			else
			{
				int m=0;
				while(k%3!=0)
				{
					k=k-7;
					if(k<0)
					{
						m=1;
						break;
					}
				}
				if(m==0)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}	
		}
	}
}