import java.util.Scanner;
class strings
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String str;
		int i,j,k,l;
		str=scan.next();
		i=str.length();
		char A[]=str.toCharArray();
		l=0;
		for(char ch='a';ch<='z';ch++)
		{
			int m=0;
			for(j=0;j<i;j++)
			{
				if(A[j]==ch)
				{
					m++;
				}
			}
			if(m>1)
			{
				l=l+m-1;
			}
		}
		System.out.println(l);
	}
}