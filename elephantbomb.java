import java.util.Scanner;
class elephantbomb
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		String str;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int m=0;
			n=scan.nextInt();
			str=scan.next();
			int A[]=new int[n];
			for(k=0;k<n;k++)
			{
				A[k]=Integer.parseInt(String.valueOf(str.charAt(k)));
			}
			for(j=0;j<n;j++)
			{
				if(A[j]==1)
				{
					m++;
				}
			}
			m=3*m;
			if(A[0]==1)
			{
				m--;
			}
			if(A[n-1]==1)
			{
				m--;
			}
			System.out.println(n-m);
		}
	}
}