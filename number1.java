import java.util.Scanner;
class number1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		if(t==0)
		{
			System.out.println("2");
		}
		if(t==1)
		{
			System.out.println("1");
		}
		int p=0;
		if(t>1)
		{
			for(i=2;i<=t/2;i++)
			{
				if(t%i==0)
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
				System.out.println("0");
			}
			if(p==1)
			{
				l=t+1;
				k=0;
				while(p!=0)
				{
					for(j=2;j<=t/2;j++)
					{
						if(l%j==0)
						{
							k=1;
							break;
						}
					}
					if(k==0)
					{
						p=0;
						break;
					}
					l++;
				}
				if(p==0)
				{
					System.out.println(l-t);
				}	
			}
		}
	}
}