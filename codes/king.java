import java.util.Scanner;
import java.util.Arrays;
public class king
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		l=0;
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
			l=l+A[i];
		}
		Arrays.sort(A);
		System.out.println(n*A[n-1]-l);
	}
}