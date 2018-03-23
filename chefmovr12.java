import java.util.Scanner;
class chefmovr12
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int d=scan.nextInt();
			Long A[]=new Long[n];
			Long sum=0L;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
				sum=sum+A[j];
			}
			Long h=sum/n;
			Long m=0L;
			if(h*n!=sum)
			{
				System.out.println("-1");
			}
			else
			{
				int p=0;
				for(k=0;k<n-d;k++)
				{
					if(A[k]>=h)
					{
						m=m+A[k]-h;
						A[k+d]=A[k+d]+A[k]-h;
						A[k]=h;
					}
					if(A[k]<h)
					{
						m=m-A[k]+h;
						A[k+d]=A[k+d]+A[k]-h;
						A[k]=h;
					}
				}
				for(k=0;k<n-d;k++)
				{
					if(A[k]+A[k+d]!=2*h)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					System.out.println(m);
				}
				else
				{
					System.out.println("-1");
				}
			}
		}
	}
}