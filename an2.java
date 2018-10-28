import java.util.Scanner;
class chefsequence
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int q=scan.nextInt();
			int m=0;
			for(j=0;j<n;j++)
			{
				k=scan.nextInt();
				if(k!=1)
				{
					m++;
				}	
			}
			if(m<=q)
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
