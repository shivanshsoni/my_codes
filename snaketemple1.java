import java.util.Scanner;
class snaketemple1
{
	public static void main(String[]atgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			Long sum=0L;
			int p=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				sum=sum+A[j];
				if(A[j]>p)
				{
					p=A[j];
				}
			}
			k=0;
			l=0;
			while(A[k+1]<p)
			{
				if(A[k+1]>A[k])
				{
					l++;
				}
				k++;
			}
			k=n-1;
			int m=0;
			while(A[k-1]<p)
			{
				if(A[k-1]>A[k])
				{
					m++;
				}
				k--;
			}
			if(m>=l)
			{
				n=l+2;
			}
			else
			{
				n=m+2;
			}
			Long sum1=(n*(n+1L)/2L)+((n-1L)*(n)/2L);
			System.out.println(sum-sum1);
		}
	}
}