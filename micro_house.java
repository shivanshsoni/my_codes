import java.util.Scanner;
import java.util.Arrays;
class micro_house
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int p,y,n,m,i,j,k,l;
		n=scan.nextInt();
		m=scan.nextInt();
		int A[]=new int[2*n*m];
		int B[][]=new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				B[i][j]=scan.nextInt();
			}
		}
		int s=0;
		for(k=0;k<n;k++)
		{
			p=B[k][0];
			for(l=1;l<m;l++)
			{
				p=p^B[k][l];
				A[s]=p;
				//System.out.println(A[s]);
				s++;
			}
		}
		k=0;
		l=0;
		for(k=0;k<m;k++)
		{
			y=B[0][k];
			for(l=1;l<n;l++)
			{
				y=y^B[l][k];
				A[s]=y;
				//System.out.println(A[s]);
				s++;
			}
		}
		for(int u=0;u<s;u++)
		{
			int t;
			for(int o=1;o<s;o++)
			{
				if(A[u]>A[o])
				{
					t=A[u];
					A[u]=A[o];
					A[o]=t;
				}
			}
		}
		System.out.println(A[1]);
	}
}