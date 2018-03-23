import java.util.Scanner;
class fillmtr
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
			int m=scan.nextInt();
			int p=0;
			for(j=0;j<m;j++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				if(B[a-1]==0&&B[b-1]==0)
				{
					A[a-1]=c;
					A[b-1]=0;
					B[a-1]=1;
					B[b-1]=1;
				}
				else if(B[a-1]==0&&B[b-1]==1)
				{
					if(A[b-1]>=c)
					{
						A[a-1]=-c+A[b-1];
					}
					else
					{
						A[a-1]=c+A[b-1];
					}
					B[a-1]=1;
				}
				else if(B[b-1]==0&&B[a-1]==1)
				{
					if(A[a-1]<c)
					{
						A[b-1]=A[a-1]+c;
					}
					else
					{
						A[b-1]=A[a-1]-c;
					}
					B[b-1]=1;
				}
				else 
				{
					int o=0;
					if(A[a-1]-A[b-1]>0)
					{
						o=A[a-1]-A[b-1];
					}
					else
					{
						o=-A[a-1]+A[b-1];	
					}
				}
			}

			int C[][]=new int[n][n];
			for(k=0;k<n;k++)
			{
				for(l=0;l<n;l++)
				{
					if(A[k]>A[l])
					{
						C[k][l]=A[k]-A[l];
					}
					else
					{
						C[k][l]=A[l]-A[k];
					}
				}
			}
			for(k=0;k<n;k++)
			{
				for(l=0;l<n;l++)
				{
					if(C[k][l]!=C[l][k])
					{
						p=1;
						break;
					}
				}
				if(p==1)
				{
					break;
				}
			}
			if(p==0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}