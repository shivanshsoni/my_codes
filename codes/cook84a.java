import java.util.Scanner;
import java.util.Arrays;
class cook84a
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
			
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			Long sum=(Long) A[0];
			for(k=1;k<n;k++)
			{
				sum=sum|k;
			}
			System.out.println(sum);
		}
	}
}