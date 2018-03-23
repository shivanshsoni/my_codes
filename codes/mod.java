import java.util.Scanner;
class mod
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			k=scan.nextInt();
			char A[]=str.toCharArray();
			l=str.length();
			int m=0;
			for(j=0;j<l;j++)
			{
				if(A[j]=='e')
				{
					m++;
				}
			}
			System.out.println(m%(k+1));
		}
	}
}