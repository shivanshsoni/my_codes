import java.util.Scanner;
class upsidedown
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		String ptr=new StringBuffer(str).reverse().toString();
		char A[]=str.toCharArray();
		char B[]=ptr.toCharArray();
		int a=0;
		int b=0;
		System.out.println(ptr+" "+str);
		int y=str.length()-1;
		for(i=0;i<A.length-i;i++)
		{
			if(A[i]!=A[y])
			{
				a++;
			}
			y--;
		}
		//System.out.println(a);
		l=0;
		for(k=0;;k++)
		{
			int p=0;
			StringBuilder sb=new StringBuilder(str);
			String mtr=Character.toString(ptr.charAt(l));
			sb=sb.append(mtr);
			str=sb.toString();
			ptr=new StringBuffer(str).reverse().toString();
			if(str.equals(ptr))
			{
				p=1;
			}
			b++;
			l++;
			if(p==1||b>a)
			{
				break;
			}
		}
		//System.out.println(b);
		if(b>a)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
}