import java.util.Scanner;
import java.util.Arrays;
class codechef
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,x,k,i,j;
	
		n=scan.nextInt();
		x=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
			//System.out.println(A[i]);
		}
		Arrays.sort(A);
		int l=A[n-1];
		for(j=0;j<k;j++)
		{
			l=l*x;
			//System.out.println(l);
		}
		//System.out.println(l);
		A[n-1]=l;
		int p=0;
		for(int y=0;y<n;y++)
		{
			p=p|A[y];
		}
		System.out.println(p);
	}
}