import java.util.Scanner;
class cook89a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String str[]=new String[n];
			String mtr="",ptr="";
			int p=0;
			for(j=0;j<n;j++)
			{
				str[j]=scan.next();
				if(j>0)
				{
					if(str[j].equals(str[j-1]))
					{

					}
					else
					{
						if(p==0)
						{
							ptr=str[j];
							p=1;
						}
						else
						{}
					}
				}
			}
			mtr=str[0];
			int a=0;
			int b=0;
			for(k=0;k<n;k++)
			{
				if(str[k].equals(mtr))
				{
					a++;
				}
				else
				{
					b++;
				}
			}
			if(a>b)
			{
				System.out.println(mtr);
			}
			else if(b>a)
			{
				System.out.println(ptr);
			}
			else 
			{
				System.out.println("Draw");
			}
		}
	}
}