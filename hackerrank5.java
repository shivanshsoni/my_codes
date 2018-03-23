import java.util.*;
class hackerrank5
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str;
		for(i=0;i<t;i++)
		{
			str=scan.next();
			j=str.length();
			char A[]=str.toCharArray();
			char B[]=new char[j/2+1];
			char C[]=new char[j/2+1];
			int a=0;
			int b=0;
			for(k=0;k<j;k++)
			{
				if(k%2==0||k==0)
				{
					B[a]=A[k];
					a++;
				}
				else
				{
					C[b]=A[k];
					b++;
				}
			}
			String ptr=String.valueOf(B);
			//int c=ptr.length();
			String mtr=String.valueOf(C);
			//int d=mtr.length();
			if(a==b)
			{
					System.out.println(ptr + mtr);
			}
			else
			{
				System.out.println(ptr + " " +mtr);
			}
		}
	}
}