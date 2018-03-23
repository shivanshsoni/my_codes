import java.util.Scanner;
class snakes
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String str=scan.next();
			char A[]=str.toCharArray();
			int p=0;
			for(j=0;j<n;j++)
			{
				if(A[j]=='H')
				{
					p++;
				}
				if(A[j]=='T')
				{
					p--;
				}
				if(p>1||p<0)
				{
					break;
				}
			}
			if(p!=0)
			{
				System.out.println("Invalid");
			}
			else
			{
				System.out.println("Valid");
			}
		}
	}
}