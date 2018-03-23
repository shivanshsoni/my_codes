import java.util.Scanner;
public class borya
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int sum=0;
		t=scan.nextInt();
		int max=0;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			l=scan.nextInt();
			if(i==0)
			{
				max=k;
			}
			else
			{
				for(j=0;;j++)
				{
					if(k<=max)
					{
						k=k+l;
					}
					else
					{
						break;
					}
				}
				max=k;
			}
		}
		System.out.println(max);
	}
}