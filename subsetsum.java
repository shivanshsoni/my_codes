import java.util.Scanner;
class subsetsum
{
	static boolean issubsetsum(int A[], int n, int sum)
	{
		if(sum==0)
		{
			return true;
		}
		if(n==0&&sum!=0)
		{
			return false;
		}
		if(A[n-1]>sum)
		{
			return issubsetsum(A, n-1, sum);
		}
		return issubsetsum(A, n-1, sum)||issubsetsum(A, n-1, sum-A[n-1]);
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,sum,n,i,j;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			sum=scan.nextInt();
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
		
			if(issubsetsum(A, n, sum) == true)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}