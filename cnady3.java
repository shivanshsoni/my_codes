import java.util.Scanner;
class cnady3
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int sum=0;
			for(j=0;j<n;j++)
			{
				k=scan.nextInt();
				sum=sum+k;
			}
			if(sum%n==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}