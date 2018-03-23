import java.util.Scanner;
import java.util.Arrays;
class candies
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,M,a,b,i,j,k,l;
		n=scan.nextInt();
		M=scan.nextInt();
		a=scan.nextInt();
		b=scan.nextInt();
		int A[]=new int[n];
		int x=0;
		for(i=0;i<n;i++)
		{
			x=(x*a+b)%M;
			A[i]=x/256;
		}
		Arrays.sort(A);
		System.out.println(A[n-1]-A[0]);
	}
}