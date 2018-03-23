import java.util.Scanner;
import java.util.Arrays;
class palingam
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			char A[]=str.toCharArray();
			Arrays.sort(A);
			String ptr=scan.next();
			char B[]=ptr.toCharArray();
			Arrays.sort(B);
			int p=0;
			int y=0;
			int m=0;
			for(j=0;j<str.length();j++)
			{
				for(k=0;k<str.length();k++)
				{
					if(A[j]==B[k])
					{
						m=1;
					}
				}
				if(m==1)
				{
					break;
				}
			}
			for(l=0;l<str.length()-1;l++)
			{
				if(A[l]==A[l+1])
				{
					y=1;
					break;
				}
			}
			if(m==1)
			{
				System.out.println("B");
			}
			else
			{
				else if(y==1)
				{
					System.out.println("A");
				}
				else
				{
					System.out.println("B");
				}
			}
		}
	}
}