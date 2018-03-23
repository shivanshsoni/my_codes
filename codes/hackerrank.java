import java.util.Scanner;
class hackerrank
{
	public static void main(String[]ats)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int n;
		n=scan.nextInt();
		t=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		k=n;
		l=0;
		for(j=0;j<t-1;j++)
		{
			n=n-A[j];
			if(n<5)
			{
				l=l+k-n;
				n=k;
			}
		}
		System.out.println(l);
	}
}