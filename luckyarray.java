import java.util.Scanner;
import java.util.Arrays;
class luckyarray
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
			l=0;
			k=0;
			while(A[k]==A[0]&&k<n)
			{
				k++;
			}
			if(k%2==0)
			{
				System.out.println("Unlucky");
			}
			else
			{
				System.out.println("Lucky");
			}
		}
	}
}