import java.util.Scanner;
class journey
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t-1];
		int B[]=new int[t-1];
		int C[]=new int[t-1];
		for(i=0;i<t-1;i++)
		{
			A[i]=scan.nextInt();
		}
		for(i=0;i<t-1;i++)
		{
			B[i]=scan.nextInt();
		}
		for(i=0;i<t-1;i++)
		{
			C[i]=scan.nextInt();
		}
		for(j=0;j<n;j++)
		{
			int sum=0;
			int p=0;
			k=scan.nextInt();
			for(i=0;i<t-1;i++)
			{
				l=0;
				if(k<A[i])
				{
					k=B[i];
					if(k==B[i])
					{
						l=1;
					}
					if(k<A[i])
					{	
						p=1;
						break;
					}
				}
				if(k>=A[i])
				{
					if(l==1)
					{
						System.out.println(C[i]);
						sum=sum+C[i];
					}
					k=k-A[i];
				}
			}
			if(p==1)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(sum);
			}
		}
	}
}