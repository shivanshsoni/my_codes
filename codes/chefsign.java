import java.util.Scanner;
class chefsign
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
			
			int sum=1;
			if(str.length()==1)
			{
				if(A[0]=='>'||A[0]=='<')
				{
					System.out.println("2");
				}
				else
				{
					System.out.println('1');
				}
			}
			else
			{
				for(j=0;j<str.length();j++)
				{
					if(A[j]=='<')
					{
						a++;		
					}
					if(A[j]=='>')
					{
						b++;
					}
				}
				if(b>a)
				{
					sum=b-a+1;
					int c=0;
					for(k=0;k<str.length();k++)
					{
						if(c<sum)
						{
							c=sum;
						}
						if(A[k]=='<')
						{
							sum++;
						}
						if(A[k]=='>')
						{
							sum--;
						}
						if(c<sum)
						{
							c=sum;
						}
					}
					System.out.println(c);
				}
				else
				{
					sum=1;
					int c=0;
					for(k=0;k<str.length();k++)
					{
						if(A[k]=='<')
						{
							sum++;
						}
						if(A[k]=='>'&&sum>1)
						{
							sum--;
						}
						if(A[k]=='>'&&sum==1)
						{
							c++;
						}
						if(c<sum)
						{
							c=sum;
						}
					}
					System.out.println(c);
				}
			}
		}
	}
}