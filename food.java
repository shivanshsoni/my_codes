import java.util.Scanner;
class food
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,i,j,k,l;
		n=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[n];
		l=0;
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
			l=l+A[i];
			for(i>=1)
			{
				if(A[i]+A[i-1]<k)
				{
					A[i]=k-A[i]-A[i-1];
				}
			}
		}
		int m=0;
		for(j=0;j<n;j++)
		{
			m=m+A[j];
		}
		System.out.println(m-l);
		for(int y=0;y<n;y++)
		{
			System.out.println("%d ",A[y]);
		}
	}
}