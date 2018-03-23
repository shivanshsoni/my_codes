import java.util.Scanner;
import java.util.Arrays;
class maxproduct
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
		Long lm=Long.valueOf(A[n-1])*A[n-2];
		System.out.println(lm);
	}
}