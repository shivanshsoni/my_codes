import java.util.Scanner;
class seaco1
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
			Long A[][]=new Long[m][n];
			Long B[]=new Long[n];
			for(j=0;j<m;j++)
			{
				for(int f=0;f<n;f++)
				{
					A[j][f]=0L;
				}
				k=scan.nextInt();
				int a=scan.nextInt();
				int b=scan.nextInt();
				if(k==1)
				{
					for(l=a-1;l<=b-1;l++)
					{
						A[j][l]=A[j][l]+1L;
						B[l]=(B[l]+A[j][l])%1000000007;
					}
				}
				else
				{
					for(l=a-1;l<=b-1;l++)
					{
						for(int y=0;y<n;y++)
						{
							A[j][y]=(A[j][y]+A[l][y])%1000000007;
							B[j]=
						}
					}
				}
			}
			for(int g=0;g<n;g++)
			{
				B[g]=0L;
			}
			for(int x=0;x<m;x++)
			{
				for(int y=0;y<n;y++)
				{
					B[y]=(B[y]+A[x][y])%1000000007;
				}
			}
			for(int z=0;z<n;z++)
			{
				System.out.print(B[z]%1000000007+" ");
			}
			System.out.println(" ");
		}
	}
}