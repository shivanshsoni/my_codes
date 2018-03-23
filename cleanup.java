import java.util.Scanner;
class cleanup
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,b,n,m,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			int A[]=new int[m];
			int B[]=new int[n];
			for(j=0;j<m;j++)
			{
				A[j]=scan.nextInt();
			}
			b=0;
			for(k=1;k<=n;k++)
			{
				int a=0;
				for(l=0;l<m;l++)
				{
					if(A[l]==k)
					{
						a++;
					}
				}
				if(a==0)
				{
					B[b]=k;
					b++;
				}
			}
			int c,d;
			for(c=0;c<b;c=c+2)
			{
				System.out.printf("%d ",B[c]);
			}
			System.out.println("");
			for(d=1;d<b;d=d+2)
			{
				System.out.printf("%d ",B[d]);
			}
			System.out.println("");
		}
	}
}