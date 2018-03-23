import java.util.Scanner;
import java.util.Arrays;
class chanoq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[30000001];
			Arrays.fill(A,0);
			int B[]=new int[n];
			int C[]=new int[n];
			for(j=0;j<n;j++)
			{
				B[j]=scan.nextInt();
				C[j]=scan.nextInt();
			}
			int q=scan.nextInt();
			for(int r=0;r<q;r++)
			{
				Arrays.fill(A,0);
				int y=scan.nextInt();
				for(l=0;l<y;l++)
				{
					A[scan.nextInt()]=1;
				}
				int m=0;
				for(k=0;k<n;k++)
				{
					int s=0;
					for(l=B[k];l<=C[k];l++)
					{
						if(A[l]==1)
						{
							s++;
						}
					}
					if(s%2!=0)
					{
						m++;
					}
				}
				System.out.println(m);
			}
		}
	}
}