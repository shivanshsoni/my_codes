import java.util.Scanner;
public class alpha
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;
		String str;
		str=scan.next();
		k=str.length();
		char A[]=str.toCharArray();
		char mn='a';
		//System.out.println(A[0]);
		l=123-A[0];
		if(l>13)
		{
			l=26-l;
		}
		//System.out.println(l);
		for(i=1;i<k;i++)
		{

			int m=0;
			int n=0;
			m=A[i]-A[i-1];
			if(m<0)
			{
				m=-m;
			}
			n=26-m;
			if(n<m)
			{
				l=n+l;
			}
			else
			{
				l=m+l;
			}
		}
		System.out.println(l);
	}
}