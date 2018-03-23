import java.util.Scanner;
class code34
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			if(n==1)
			{
				System.out.println(k);
			}
			Double ans;
			ans=(k*n)/Math.sqrt(n-1);
			for(j=0;j<n;j++)
			{
				System.out.print("0 ");
			}
			System.out.println(ans);
		}
	}
}