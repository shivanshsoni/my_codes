import java.util.Scanner;
class chefmovr
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
			int A[]=new int[n];
			Long sum=0L;
			// Long sum1=0L;
			// Long sum2=0L;
			int a=0;
			int b=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				sum=sum+A[j];
			}
			Long h=sum/n;
			int p=0;
			int m=0;
			//System.out.println(h+" "+n);
			// System.out.println(h*n+" "+a*h+" "+b*h);
			if(h*n!=sum)
			{
				System.out.println("-1");
			}
			else
			{
				p=0;
				for(l=0;l<n-d;l++)
				{
					if(A[l]+A[l+d]>=h+1&&A[l]>A[l+d])
					{
						while(A[l+d]!=h)
						{
							m++;
							A[l+d]++;
							A[l]--;
						}
					}
					if(A[l]+A[l+d]>=h+1&&A[l]<=A[l+d])
					{
						while(A[l]!=h)
						{
							m++;
							A[l]++;
							A[l+d]--;
						}
					}
					if(A[l]+A[l+d]<h+1)
					{
						p=1;
					}
				}
				if(p==1)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(m);
				}
			}
		}
	}
}