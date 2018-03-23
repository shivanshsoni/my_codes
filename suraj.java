import java.util.Scanner;
import java.util.Arrays;
class suraj
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			int u=n;
			for(int y=0;y<u;y++)
			{
				B[y]=A[n-1];
				n--;
			}
			l=0;
			int p=u/4;
			if(u%4==1)
			{
				for(k=0;k<u;k=k+4)
				{
					if(k==4*p)
					{
						l=l+B[k];
					}
					else
					{
						l=l+B[k]+B[k+1];
					}
				}
				System.out.println(l);
			}
			else
			{
				for(k=0;k<u;k=k+4)
				{
					l=l+B[k]+B[k+1];
				}
				System.out.println(l);
			}
		}
	}
}