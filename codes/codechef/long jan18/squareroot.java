import java.util.Scanner;
class squareroot
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j;
		t=scan.nextInt();
		i=0;
		Long k=1L;
		Long l=1L;
		Long f=1L;
		if(t==1)
			{
		System.out.println("2");
	}
	else if(t==2)
	{
		System.out.println("4");
	}
	else if(t==3)
	{
		System.out.println("8");
	}
	else if(t==4)
	{
		System.out.println("12");
	}
	else
	{
		while(i!=t)
		{
			for(k=12L;;k++)
			{
				int p=0;
				for(l=2L;l<=k;l++)
				{
					if(k%(l*l)==0)
					{
						p=1;
						break;
					}
				}
				if(p==1)
				{
					i++;
					//System.out.println(i+" "+k);
					if(i==t)
					{
						f=k;
						break;
					}
				}
			}
		}
		System.out.println(k);
	}
	}
}