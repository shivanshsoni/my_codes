import java.util.Scanner;
class alate
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int q=scan.nextInt();
			Long A[]=new Long[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
			}
			for(k=0;k<q;k++)
			{
				l=scan.nextInt();
				if(l==1)
				{
					int a=scan.nextInt();
					Long sum=0L;
					for(int c=a-1;c<n;c+=a)
					{
						sum=sum+(A[c]*A[c])%1000000007;
						sum=sum%1000000007;
					}
					System.out.println(sum);
				}
				if(l==2)
				{
					int a=scan.nextInt();
					Long b=scan.nextLong();
					A[a-1]=b;
				}
			}
		}
	}
}