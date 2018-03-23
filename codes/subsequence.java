import java.util.Scanner;
class subsequence
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,m,n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			j=str.length();
			int A[]=new int[j];
			l=0;
			int p=0;
			m=0;
			n=0;
			for(k=0;k<j;k++)
			{
				A[k]=Integer.parseInt(String.valueOf(str.charAt(k)));
				if(A[k]==1)
				{
					l++;
					m=k;
				}
			}
			for(int y=0;y<j;y++)
			{
				if(A[y]==1)
				{
					n=y;
					break;
				}
			}
			if(m-n+1==l)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
