import java.util.Scanner;
class chefsign2
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
			char B[]=new char[str.length()];
			int o=0;
			for(k=0;k<str.length();k++)
			{
				if(A[k]!='=')
				{
					B[o]=A[k];
					o++;
				}
			}
			l=0;
			int res=0;
			while(l<o)
			{
				char ch=B[l];
				l++;
				int p=1;
				while(l<o&&B[l]==ch)
				{
					p++;
					l++;
				}
				if(res<p)
				{
					res=p;
				}
			}
			System.out.println(res+1);
		}
	}
}