import java.util.Scanner;
class chefgp
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,y;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			int a=scan.nextInt();
			int b=scan.nextInt();
			char A[]=str.toCharArray();
			int c=0;
			int d=0;
			for(j=0;j<str.length();j++)
			{
				if(A[j]=='a')
				{
					c++;
				}
				else
				{
					d++;
				}
			}
			StringBuilder ptr=new StringBuilder("");
			if((c/a)>(d/b))
			{
				for(k=0;k<(d/b);k++)
				{
					for(int as=0;as<a;as++)
					{
						ptr.append("a");
					}
					for(sa=0;sa<b;sa++)
					{
						ptr.append("b");
					}
				}
				for(l=0;l<((c/a)-(d/b)-1);l++)
				{
					ptr.append("a");
					ptr.append("*");
				}
				ptr.append("a");
			}
			if((c/a)<(d/b))
			{
				for(k=0;k<(c/a);k++)
				{
					ptr.append("b");
					ptr.append("a");
				}
				for(l=0;l<((d/b)-(c/a)-1);l++)
				{
					ptr.append("b");
					ptr.append("*");
				}
				ptr.append("b");
			}
			if((c/a)==(d/b))
			{
				for(k=0;k<(c/a);k++)
				{
					ptr.append("a");
					ptr.append("b");
				}
			}
			System.out.println(ptr.toString());
		}
	}
}