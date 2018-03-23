import java.util.Scanner;
class fillmtr2
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
			int A[][]=new int[n][n];
			boolean bool[][]=new boolean[n][n];
			for(j=0;j<m;j++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				A[a-1][b-1]=c;
				bool[a-1][b-1]=true;
			}
			int y=0;
			int f=0;

			for(k=0;k<n;k++)
			{
				int h=0;
				for(l=0;l<n;l++)
				{
					if(A[k][l]==1)
					{
						h++;
					}
				}
				if(f<h)
				{
					f=h;
					y=k;
				}
			}
			for(k=0;k<n;k++)
			{
				int h=0;
				for(l=0;l<n;l++)
				{
					if(bool[k][l]==false)
					{
						if(k==l)
						{
							A[k][l]=0;
							bool[k][l]=true;
						}
						else
						{
							if(bool[l][k]==true)
							{
								A[k][l]=A[l][k];
							}
							else
							{
								if(A[y][k]-A[y][l]>=0)
								{
									A[k][l]=A[y][k]-A[y][l];
								}
								else
								{
									A[k][l]=A[y][l]-A[y][k];	
								}
							}
						}
					}
				}
			}
			int p=0;

			for(k=0;k<n;k++)
			{
				for(l=0;l<n;l++)
				{
					if(k==l&&A[k][l]!=0)
					{
						p=1;
						break;
					}
					else
					{
						if(A[k][l]!=A[l][k])
						{
							p=1;
							break;
						}
						if(A[y][k]-A[y][l]>0)
						{
							if(A[k][l]!=A[y][k]-A[y][l])
							{
								p=1;
								break;
							}
						}
						else
						{
							if(A[k][l]!=A[y][l]-A[y][k])
							{
								p=1;
								break;
							}
						}
					}
				}
				if(p==1)
				{
					break;
				}
			}

			if(p==1)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("yes");
			}
		}
	}
}