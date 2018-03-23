import java.util.Scanner;
class dance
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		int C[]=new int[t-1];
		for(i=0;i<n;i++)	
		{
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
		}
		l=0;
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			{
				if(A[j]==j&&j<t)
				{
					if(C[B[k]-1]==0)
					{
						C[B[k]-1]=C[j]+1;
					}
					else
					{
						if(j+1<C[B[k]-1])
						{
							C[B[k]-1]=j+1;	
						}
					}
				}
			}
		}
		for(l=0;l<t-1;l++)
		{
			System.out.println(C[l]);
		}
	}
}