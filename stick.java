import java.util.Scanner;
import java.util.Arrays;
class stick
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,d,i,j,k,l;
		n=scan.nextInt();
		d=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		int m=0;
		for(j=0;j<n-1;j++)
		{
			if(A[j+1]-A[j]<=d)
			{
				j++;
				m++;
			}
		}
		System.out.println(m);
	}
}