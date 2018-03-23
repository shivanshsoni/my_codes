import java.util.Scanner;
class permutations
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		
		int a=0;
		for(j=1;j<=n;j++)
		{
			int m=0;
			for(k=0;k<n;k++)
			{
				if(A[k]==j)
				{
					m++;
				}
			}
			if(m>1)
			{
				a=a+m-1;
			}
		}
		System.out.println(n-a-1);
	}
}