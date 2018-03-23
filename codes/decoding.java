import java.util.Scanner;
public class decoding
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b,c,d;
		String str;
		t=scan.nextInt();
		str=scan.next();
		l=t/4;
		if(t%4!=0)
		{
			System.out.println("===");
		}
		else
		{
			a=0;
			b=0;
			c=0;
			d=0;
			char[] A=str.toCharArray();
			for(i=0;i<t;i++)
			{
				if(A[i]=='A')
				{
					a++;
				}
				if(A[i]=='G')
				{
					b++;
				}
				if(A[i]=='C')
				{
					c++;
				}
				if(A[i]=='T')
				{
					d++;
				}
			}
			if(a>l||b>l||c>l||d>l)
			{
				System.out.println("===");
			}
			else
			{
				k=0;
				while(a!=l)
				{
					if(A[k]=='?')
						{
							A[k]='A';
							a++;
						}
						k++;

				}
				//k=0
					while(b!=l)
					{
						if(A[k]=='?')
						{
							A[k]='G';
							b++;
						}
						k++;
					}
					while(c!=l)
					{
						if(A[k]=='?')
						{
							A[k]='C';
							c++;
						}
						k++;
					}
//					k=0;
					while(d!=l)
					{
						if(A[k]=='?')
						{
							A[k]='T';
							d++;
						}
						k++;
					}
					for(int u=0;u<t;u++)
					{
						System.out.printf("%c",A[u]);
					}
				}
			}
		}
	}
