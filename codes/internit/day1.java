import java.util.Scanner;
class day1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n+1];
			int sum=0;
			for(j=0;j<=n;j++)
			{
				A[j]=scan.nextInt();
				sum=sum+A[j];
				if(sum%2==0&&j<n)
				{
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}