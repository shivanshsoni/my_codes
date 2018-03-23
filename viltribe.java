import java.util.Scanner;
class viltribe
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
			int a=0;
			int b=0;
			int sum=-1;
			char prev='a';
			for(j=0;j<str.length();j++)
			{
				if(A[j]=='A'||A[j]=='B')
				{
					if(A[j]=='A')
					{
						if(prev=='a')
						{
							prev='A';
							a++;
						}
						else
						{
							if(prev=='A')
							{	
								a=a+j-sum;
							}
							else
							{
								a++;
							}
						}
						prev='A';
					}
					else
					{
						if(prev=='a')
						{
							prev='B';
							b++;
						}
						else
						{
							if(prev=='B')
							{	
								b=b+j-sum;
							}
							else
							{
								b++;
							}
						}
						prev='B';
					}
					sum=j;
				}
			}
			System.out.println(a+" "+b);
		}
	}
}