import java.util.Scanner;
class permu
{
	public static void main(String[]atshs)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,k;
		int l,j;
		n=scan.nextInt();
		j=n*(n+1)/2
		int A[]=new int[n];
		l=0;
		for(k=0;k<n;k++)
		{
			A[k]=scan.nextInt();
			l=l+A[k];
		}
		if(l==j)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}