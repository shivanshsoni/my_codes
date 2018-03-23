import java.util.Scanner;
class chefmovr1
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
			int sum=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				sum=sum+A[j];
			}
			int h=sum/n;
			int m=0;
			int p;
			if(h*n!=sum)
			{
				System.out.println("-1");
			}
			else
			{
				p=0;
				for(k=0;k<n-d;k++)
				{
					//System.out.println(A[k]+A[k+d]);
					if(A[k]+A[k+d]>=h&&A[k]>A[k+d])
					{
						m=m+h-A[k+d];
						A[k]=A[k]+A[k+d]-h;
						A[k+d]=h;
					}
					if(A[k]+A[k+d]>=h&&A[k+d]>=A[k])
					{
						m=m+h-A[k+d];
						A[k+d]=A[k]+A[k+d]-h;
						A[k]=h;
					}
					if(A[k]+A[k+d]<h)
					{
						p=1;
					}
				}
				System.out.println(m);
			}
		}
	}
}