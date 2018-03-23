import java.util.Scanner;
class array
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,q,i,j;
		Long k,l;
		n=scan.nextInt();
		q=scan.nextInt();
		Long A[]=new Long[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextLong();
		}
		Long a,b;
		for(j=0;j<q;j++)
		{
			l=0L;
			a=scan.nextLong();
			b=scan.nextLong();
			for(k=a-1;k<=b-1;k++)
			{
				l.equals(l+A[k]);
			}
			System.out.println(l);
		}
	}
}