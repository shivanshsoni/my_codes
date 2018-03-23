import java.util.Scanner;
class seaco2
{
	public static void main(String[]args)
	{
		int i,j,k,l;
		Scanner scan=new Scanner(System.in);
		int t;
		t=scan.nextInt();		
		for(i=0;i<t;i++)
		{
			int n,m;
			n=scan.nextInt();
			m=scan.nextInt();
			int A[]=new int[n];
			int C[]=new int[m];
			int B[]=new int[n];
			for(j=0;j<m;j++)
			{
				int f;
				k=scan.nextInt();
				int a,b;
				a=scan.nextInt();
				b=scan.nextInt();
				if(k==1)
				{
					for(l=a-1;l<=b-1;l++)
					{
						A[l]=A[l]+1;
						C[j]=1;
					}
				}
				else
				{
					int y;
					for(l=a-1;l<=b-1;l++)
					{
						if(C[l]==1)
						{
							for(y=0;y<n;y++)
							{
								A[y]=A[y]+A[l]);
							}
						}
					}
				}
			}
			int g;
			int x,y,z;
			for(int e=0;e<n;e++)
			{
				B[e]=0L;
			}
			for(x=0;x<m;x++)
			{
				for(y=0;y<n;y++)
				{
					B[y]=(B[y]+A[x][y]);
				}
			}	
			for(z=0;z<n;z++)
			{
				System.out.print(B[z]%1000000007+" ");
			}
			System.out.println(" ");
		}	
	}
}