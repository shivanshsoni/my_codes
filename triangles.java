import java.util.Scanner;
class triangles
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[][]=new int[t+1][t+1];
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				A[i][j]=scan.nextInt();
			}
		}
		int v=0;
		for(k=0;k<t;k++)
		{
			for(l=0;l<t;l++)
			{
				int q=0;
				if(k==0&&l==0)
				{
					q=A[k][l+1]+A[k+1][l];
				}
				if(k==0&&l>0)
				{
					q=A[k][l+1]+A[k+1][l]+A[k][l-1];
				}
				if(l==0&&k>0)
				{
					q=A[k][l+1]+A[k+1][l]+A[k-1][l];	
				}
				if(l>0&&k>0)
				{
					q=A[k][l+1]+A[k+1][l]+A[k-1][l]+A[k][l-1];
				}
				int q=B[l]+C[k]-2*A[k][l];
				int m=0;
				for(int y=2;y*y<=q;y++)
				{
					if(q%y==0)
					{
						m=1;
						break;
					}
				}
				if(m==0)
				{
					v++;
				}
			}
		}
		System.out.println(v);
	}
}