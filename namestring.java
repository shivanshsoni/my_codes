import java.util.Scanner;
class namestring
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b,c;
		String str,ptr;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			ptr=scan.next();
			j=str.length();
			k=ptr.length();
			char A[]=str.toCharArray();
			char B[]=ptr.toCharArray();
			c=0;
			//int C[]=new int[j];
			int m=0;
			for(a=0;a<j;a++)
			{
				for(b=c;b<k;b++)
				{
					if(A[a]==B[b])
					{
						//C[m]=b;
						c=b;
						m++;
						break;
					}
				}
			}
			//System.out.println(m);
			if(m==j)
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