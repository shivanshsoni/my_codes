import java.util.Scanner;
import java.util.Arrays;
class bandwidth
{
	public static void main(String[]atdj)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,m;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[][]=new int[n][n];
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					A[j][k]=scan.nextInt();
				}
			}
			int p=0;
			l=0;
			int B[]=new int[4];
			for(l=0;l<n;l++)
			{
				if(A[0][l]!=0)
				{
					p++;
				}
			}
		//	System.out.println(p)
			B[0]=p;
			p=0;
			l=0;
			for(l=0;l<n;l++)
			{
				if(A[l][0]!=0)
				{
					p++;
				}
			}
			B[1]=p;
			p=0;
			l=0;
			for(l=0;l<n;l++)
			{
				if(A[n-1][l]!=0)
				{
					p++;
				}
			}
		//	System.out.println(p);
			B[2]=p;

			p=0;
			l=0;
			for(l=0;l<n;l++)
			{
				if(A[l][n-1]!=0)
				{
					p++;
				}
			}
			B[3]=p;
			int s=0;
			for(int y=0;y<3;y++)
			{
					if(B[y]==B[y+1])
					{
						s++;
					}
			}
			Arrays.sort(B);
		//	System.out.println(B[3]);
			if(B[3]>0&&s==3)
			{
				System.out.println(B[3]-1);
			}
			else if(B[3]>0&&s!=3)
			{
				System.out.println(B[3]);
			}
			else
			{
				System.out.println(0);
			}
		}
	}
}