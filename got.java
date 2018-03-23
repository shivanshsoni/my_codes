import java.util.Scanner;
class got
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int A[]=new int[a];
			int B[]=new int[a];
			for(j=0;j<a;j++)
			{
				A[j]=scan.nextInt();
			}
			for(l=0;l<b;l++)
			{
				for(k=1;k<a-1;k++)
				{
					if(k==1)
					{
						if(A[k]==1)
						{
							A[k-1]=1;
						}
						else
						{
							A[k-1]=0;
						}
					}
					if(k==a-2)
					{	
						if(A[k]==1)
						{
							A[k+1]=1;
						}
						
						else
						{
							A[k]=0;
						}
					}
					if(A[k-1]==1&&A[k+1]==1)
					{
						A[k]=0;
					}
				}
				for(int y=0;y<a;y++)
				{
					A[y]=B[y];
				}
			}
			for(int u=0;u<a;u++)
			{
				System.out.print(B[u]+" ");
			}
			System.out.println("");
		}

	}
}