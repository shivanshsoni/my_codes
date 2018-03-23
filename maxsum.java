import java.util.Scanner;
class maxsum
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,m,p;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			p=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int max=0;
			m=0;
			for(k=0;k<n;k++)
			{
				l=0;
				B[k]=scan.nextInt();
				l=A[k]*B[k];
				if(max<l)
				{
					max=l;
					m=k;
				}
			}
			if(A[m]<0)
			{
				A[m]=A[m]-p;
			}
			else
			{
				A[m]=A[m]+p;
			}
			int sum=0;
			for(int y=0;y<n;y++)
			{
				sum=sum+A[y]*B[y];
			}
			System.out.println(sum);
		}
	}
}