import java.util.Scanner;
class maxsc
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[][]=new int[n][n];
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					A[j][k]=scan.nextInt();
				}
			}
			if(n==1)
			{
				System.out.println(A[0][0]);
			}
			else
			{
				int B[]=new int[n];
				Long sum=0L;
				int d=0;
				for(l=n-1;l>=0;l--)
				{
					int max=-1;
					int m=0;
					for(int y=0;y<n;y++)
					{
						if(l==n-1)
						{
							if(max<A[l][y])
							{
								max=A[l][y];
								B[l]=max;
							}
						}
						else
						{
							//System.out.println(B[l+1]);
							if(A[l][y]<B[l+1])
							{
								if(max<A[l][y])
								{
									max=A[l][y];
									B[l]=max;
								}
								m++;
							}
						}
					}
					//System.out.println(m);
					if(m==0&&l!=n-1)
					{
						d=1;
						break;
					}
					sum=sum+B[l];
				}
				if(d==1)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(sum);
				}
			}
		}
	}
}