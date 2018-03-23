import java.util.Scanner;
class seaco
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
			int m=scan.nextInt();
			int B[][][]=new int[m][n][m];
			for(j=0;j<m;j++)
			{
				k=scan.nextInt();
				int a=scan.nextInt();
				int b=scan.nextInt();
				if(k==1)
				{
					for(l=a-1;l<=b-1;l++)
					{
						A[l]++;
						B[k][l][j]=A[l];
					}
				}
				else
				{
					for(zz)
				}
				for(int u=0;u<n;u++)
				{
					System.out.print(A[u]+" ");
				}
				System.out.println("");
			}
		}
	}
}