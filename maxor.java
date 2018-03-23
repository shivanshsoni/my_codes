import java.util.Scanner;
import java.util.Arrays;
class maxor
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			int m=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			for(k=0;k<n-1;k++)
			{
				for(l=k+1;l<n;l++)
				{
					if((A[k]|A[l])<=A[l])
					{
						m++;
					}
				}
			}
			System.out.println(m);
		}
	}
}