import java.util.Scanner;
import java.util.Arrays;
class batman1
{
	public static void main(String[]arsf)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		j=0;
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
			if(A[i]==0)
			{
				j++;
			}
			else
			{
				System.out.print(A[i]+" ");
			}
		}
		for(k=1;k<=j;k++)
		{
				System.out.print(0+ " ");
		}
	}
}