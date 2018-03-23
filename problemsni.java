import java.util.Scanner;
class problemsni
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str=scan.next();
		char ch1=scan.next().charAt(0);
		char ch2=scan.next().charAt(0);
		int n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			char B[]=str.toCharArray();
			StringBuilder gtr=new StringBuilder("");
			for(int y=a;y<=b;y++)
			{
				String htr=Character.toString(B[y]);
				gtr.append(htr);
			}
			String ptr=gtr.toString();
			System.out.println(ptr);
			char A[]=ptr.toCharArray();
			int m=0;
			for(k=0;k<ptr.length();k++)
			{
				for(l=k+1;l<ptr.length();l++)
				{
					if(A[k]==ch1&&A[l]==ch2)
					{
						m=m+l-k;
					}
				}
			}
			if(b-a+1==ptr.length())
				System.out.println(m+1);
			else
				System.out.println(m);
		}
	}
}