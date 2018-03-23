import java.util.Scanner;
class codes2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=0;
			for(l=0;;l++)
			{
				for(j=1;;j++)
				{
					if(n-j>=0)
					{
						n=n-j;
						k++;
					}
					else
					{
						break;
					}
				}
				if(n==0)
				{
					break;
				}
			}
			System.out.println(k);
		}
	}
}