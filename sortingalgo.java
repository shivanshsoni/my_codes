import java.util.Scanner;
class sortingalgo
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,n,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				if(j>=1)
				{
					int p=0;
					if(A[j-1]>A[j]&&(A[j-1]-A[j]==1||A[j]-A[j-1]==1))
					{
						p=A[j-1];
						A[j-1]=A[j];
						A[j]=p;
					}
				}
			}
			for(k=0;k<n-1;k++)
			{
				if(A[k+1]-A[k]>=0)
				{

				}
				else
				{
					break;
				}
			}
			if(k!=n-1)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}
}