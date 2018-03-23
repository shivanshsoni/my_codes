import java.util.Scanner;
import java.util.Arrays;
class transactions
{
	public static void main(String[]argss)
	{
		Scanner scan=new Scanner(System.in);
		int t,q,i,j,k,l,n,m;
		t=scan.nextInt();
		q=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		for(j=0;j<q;j++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			k=0;
			while(n>=A[k])
			{
				k++;
			}
			int y=k+m-1;
			if(y<=t)
			{
				System.out.println(A[y-1]);
			}
			else
			{
				System.out.println("-1");
			}
		}
	}
}