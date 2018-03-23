import java.util.Scanner;
class cheffa
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			int h=1;
			k=0;
			int sum=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<n-1;k++)
			{
				sum=sum+A[k]+A[k+1];
			}
			System.out.println(sum);
		}
	}
}