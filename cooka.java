import java.util.Scanner;
class cooka
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
			int s=0;
			k=str.length();
			if(k==1)
			{
				System.out.println("0");
			}
			else
			{
				int m=0;
				if(A[0]=='U')
				{
					for(j=0;j<k-1;j++)
					{
						if(A[j]=='U'&&A[j+1]=='D')
						{
							m++;
						}
					}
				}
				else
				{
					for(j=0;j<k-1;j++)
					{
						if(A[j]=='D'&&A[j+1]=='U')
						{
							m++;
						}
					}
				}
				System.out.println(m);
			}
		}
	}
}