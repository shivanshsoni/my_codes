import java.util.Scanner;
public class cards
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();

			l=0;
			k=2;
			for(j=0;j<n;j++)
			{
				l=(l+k)%1000007;
				k=(k+3)%1000007;
			}
			System.out.println(l);
		}
	}
}