import java.util.Scanner;
class connectedhorses
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[k];
			int B[]=new int[k];
			int C[]=new int[k];
			for(int a=0;a<k;a++)
			{
				A[a]=scan.nextInt();
				B[a]=scan.nextInt();
				C[a]=0;
			}
			int p=0;
			for(j=0;j<k;j++)
			{
				for(l=0;l<k;l++)
				{
					if(j!=k)
					{
						if(A[l]==A[j]+2&&B[l]==B[j]+1&&A[j]+2<=m&&B[j]+1<=n&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]-2&&B[l]==B[j]+1&&A[j]-2>=0&&B[j]+1<=n&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]+2&&B[l]==B[j]-1&&A[j]+2<=m&&B[j]-1>=0&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]-2&&B[l]==B[j]-1&&A[j]-2>=0&&B[j]-1>=0&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]+1&&B[l]==B[j]+2&&A[j]+1<=m&&B[j]+2<=n&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]+1&&B[l]==B[j]-2&&A[j]+1<=m&&B[j]-2>=0&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]-1&&B[l]==B[j]+2&&A[j]-1>=0&&B[j]+2<=n&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
						else if(A[l]==A[j]-1&&B[l]==B[j]-2&&A[j]-1>=0&&B[j]-2>=0&&C[l]==0)
						{
							p++;
							C[l]=1;
						}
					}
				}
			}
			System.out.println(p);
		}
	}
}