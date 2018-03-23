import java.util.Scanner;
import java.util.Arrays;
class graph5
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int n=scan.nextInt();
		int m=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[n];
		int C[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		boolean B[][]=new boolean[n][n];
		for(int c=0;c<n;c++)
		{
			for(int d=0;d<n;d++)
			{
				B[c][d]=false;
			}
		}
		for(j=0;j<m;j++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			C[a-1]++;
			C[b-1]++;
			B[a-1][b-1]=true;
			B[b-1][a-1]=true;
		}
		for(int w=0;w<n;w++)
		{
			int D[]=new int[C[w]];
			int g=0;
			for(l=0;l<n;l++)
			{
				int p=0;
				if(B[w][l]==true)
				{
					D[g]=A[l];
					g++;
				}
			}
			Arrays.sort(D);
			for(int y=0;y<n;y++)
			{
				if(D[C[w]-k]==A[y])
				{
					System.out.println(y+1);
				}
			}
		}
	}
} 