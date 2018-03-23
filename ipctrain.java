import java.util.Scanner;
import java.util.Arrays;
class ipctrain
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int sum=0;
			int n=scan.nextInt();
			int d=scan.nextInt();
			int A[]=new int[d];
			int B[]=new int[n-1];
			int C[]=new int[n-1];
			int D[]=new int[n-1];
			int E[]=new int[n-1];
			for(j=0;j<n-1;j++)
			{
				B[j]=scan.nextInt();
				C[j]=scan.nextInt();
				D[j]=scan.nextInt();
				E[j]=D[j];
			}
			Arrays.sort(E);
			for(k=0;k<n-1;k++)
			{
				int p=0;
				for(l=0;l<n-1;l++)
				{
					if(E[k]==E[l])
					{
						p=l;
						break;
					}
				}
				int m=0;
				for(int y=B[p];y<C[p]+B[p];y++)
				{
					if(y<=d&&A[y]==0)
					{
						A[y]=1;
						m++;
					}
				}
				sum=sum+E[k]*(C[p]-m);
				D[p]=0;
			}
			System.out.println(sum);
		}
	}
}