import java.util.Scanner;
class cook85c
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[][]=new int[t][t];
		int q=scan.nextInt();
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				A[i][j]=scan.nextInt();
				if(i==0&&j==0)
				{
					System.out.print("0 ");
				}
				if(i==0&&j>0)
				{
					System.out.print(-A[i][j]+" ");
				}
			}
		}
		System.out.println("");
		for(k=0;k<q;k++)
		{
			int n=scan.nextInt();
			int B[]=new int[t];
			for(l=0;l<t;l++)
			{
				B[l]=scan.nextInt();
			}
			for(int a=0;a<t;a++)
			{
				A[n-1][a]=-B[a];
				A[a][n-1]=-B[a];
			}
			for(int c=0;c<t;c++)
			{
				System.out.print(A[0][c]+" ");
				A[0][c]=-A[0][c];
			}
			System.out.println("");
		}
	}
}