import java.util.Scanner;
class gcac
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
			Long A[]=new Long[n];
			Long B[]=new Long[m];
			int C[]=new int[m];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
			}
			for(int e=0;e<m;e++)
			{
				B[e]=scan.nextLong();
				C[e]=scan.nextLong();
			}
			int D[]=new int[m];
			Long a=0L;
			Long sum=0L;
			int b=0;
			for(k=0;k<n;k++)
			{
				String str=scan.next();
				Long y=0L;
				int p=0;
				int u=0;
				for(l=0;l<m;l++)
				{
					if(str.charAt(l)=='1'&&B[l]>y&&D[l]<C[l])
					{
						y=B[l];
						p=l;
						u=1;
					}
				}
				if(u==1&&B[p]>=A[k])
				{
					D[p]++;
					sum=sum+B[p];
					a++;
					if(D[p]==1)
					{
						b++;
					}
				}
			}	
			System.out.println(a+" "+sum+" "+(m-b));
		}
	}
} 