import java.util.Scanner;
class sumq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int p=scan.nextInt();
			int q=scan.nextInt();
			int r=scan.nextInt();
			int A[]=new int[p];
			int B[]=new int[q];
			int C[]=new int[r];
			for(j=0;j<p;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<q;k++)
			{
				B[k]=scan.nextInt();
			}
			for(l=0;l<r;l++)
			{
				C[l]=scan.nextInt();
			}
			Long sum=0L;
			for(int a=0;a<p;a++)
			{
				for(int b=0;b<q;b++)
				{
					for(int c=0;c<r;c++)
					{
						if(B[b]>=A[a]&&B[b]>=C[c])
						{
							sum=sum+(A[a]+B[b])*(B[b]+C[c]);
						}
					}
				}
			}
			System.out.println(sum%1000000007);
		}
	}
}