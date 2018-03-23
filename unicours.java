import java.util.Scnner;
class mxmedian
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
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int B[]=new int[n];
			B[0]=A[0];
			B[n-1]=A[n-1];
			for(k=1;k<n-1;k=k+2)
			{
				if(A[k]>=A[k+1])
				{
					B[k]=A[k];
					B[k+1]=A[k+1];
				}
				else
				{
					B[k+1]=A[k];
					B[k]=A[k+1]
				}
			}
			for(l=0;l<n;l++)
			{
				System.out.printf("%d ",B[l]);
			}
		}
	}
}