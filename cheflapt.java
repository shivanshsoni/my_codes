import java.util.Scanner;
import java.util.Arrays;
class cheflapt
{
	public static void main(String[]rgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[101];
			Arrays.fill(A,0);
			for(j=0;j<n;j++)
			{
				l=scan.nextInt();
				A[l]++;
			}
			for(k=1;k<101;k++)
			{
				if(A[k]==1)
				{
					System.out.println(k);
					break;
				}
			}
		}
	}
}