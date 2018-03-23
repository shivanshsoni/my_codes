import java.util.Scanner;
class prob1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		int C[]=new int[t];
		for(j=0;j<t;j++)
		{
			B[j]=scan.nextInt();
			C[j]=0;
			if(A[j]==B[j])
			{
				C[j]=A[j];
			}
		}
		int b=0;
		int D[]=new int[2];
		for(int z=1;z<=t;z++)
		{
			int g=0;
			for(int y=0;y<t;y++)
			{
				if(C[y]==z)
				{
					g=1;
					break;
				}
			}
			if(g==0)
			{
				D[b]=z;
				b++;
			}
		}
		int p=-1;
		if(b==2)
		{
			for(l=0;l<t;l++)
			{
				if(C[l]==0)
				{
					if(A[l]==D[0]||B[l]==D[0])
					{
						C[l]=D[0];
						p=0;
					}
					if(A[l]==D[1]||B[l]==D[1])
					{
						C[l]=D[1];
						p=1;
					}
					if(p==-1)
					{
						
					}
				}
			}

			for(int u=0;u<t;u++)
			{
				System.out.print(C[u]+" ");
			}
		}
		else
		{
			for(l=0;l<t;l++)
			{
				if(C[l]==0)
				{
					C[l]=D[0];
					break;
				}
			}
			for(int u=0;u<t;u++)
			{
				System.out.print(C[u]+" ");
			}
		}
	}
}