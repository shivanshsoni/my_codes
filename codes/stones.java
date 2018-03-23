import java.util.Scanner;
class stones
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str,ptr;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			ptr=scan.next();
			k=str.length();
			int b=ptr.length();
			char A[]=str.toCharArray();
			char B[]=ptr.toCharArray();
			l=0;
			if(k<=b)
			{
			for(j=0;j<k;j++)
			{
				for(int a=0;a<b;a++)
				{
					if(A[j]==B[a])
					{
						l++;
						break;
					}
				}
			}
			System.out.println(l);
		}
		else
		{
			l=0;
			for(j=0;j<b;j++)
			{
				for(int a=0;a<k;a++)
				{
					if(B[j]==A[a])
					{
						l++;
						break;
					}
				}
			}
			if(l>b)
			System.out.println(b);
		else
			System.out.println(l);
		}
		}
	}
}