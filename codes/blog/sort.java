import java.util.Scanner;
import java.util.Arrays;
class sort
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		for(j=0;j<n;j++)
		{
			System.out.print(A[j]+" ");
		}
	}
}