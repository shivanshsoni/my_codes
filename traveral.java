import java.util.Scanner;
class traveral
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
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				B[j]=scan.nextInt();
			}
			int m=0;
			for(k=0;k<n;k++)
			{
				int p=0;
				for(l=0;l<n;l++)
				{
					if(A[l]>=A[k]&&B[l]>=B[k])
					{
						p=A[l]-A[k]+B[l]-B[k];
					}
					if(A[l]>=A[k]&&B[l]<=B[k])
					{
						p=A[l]-A[k]-B[l]+B[k];
					}
					if(A[l]<=A[k]&&B[l]>=B[k])
					{
						p=-A[l]+A[k]+B[l]-B[k];
					}
					if(A[l]<=A[k]&&B[l]<=B[k])
					{
						p=-A[l]+A[k]-B[l]+B[k];
					}
				}
				if(m<p)
				{
					m=p;
				}
			}
			System.out.println(m);
		}
	}
}