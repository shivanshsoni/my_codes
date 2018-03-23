import java.util.Scanner;
import java.util.Arrays;
public class codeforces2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			j=scan.nextInt();
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		m=scan.nextInt();
		int B[]=new int[m];
		for(l=0;l<m;l++)
		{
			B[l]=scan.nextInt();
			k=scan.nextInt();
		}
		Arrays.sort(B);
		if(B[m-1]-A[0]>0)
		{
			System.out.println(B[m-1]-A[0]);
		}
		else
		{
			System.out.println(0);
		}
	}
}