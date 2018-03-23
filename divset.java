import java.util.Scanner;
import java.util.Arrays;
class divset
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			int c=scan.nextInt();
			Long A[]=new Long[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
			}
			Arrays.sort(A);
			int m=0;
			for(int u=0;u<n-k+1;u++)
			{
				for(int y=0;y<k-1;y++)
				{
					if(A[y+1]>=A[y]*c)
					{
						m++;
					}
				}
			}
			System.out.println(m);
		}
	}
}