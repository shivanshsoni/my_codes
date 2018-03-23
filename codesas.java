import java.util.Scanner;
class codesas
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int sum=0;
			k=1;
			if(b>a)
			{
				while(b>0)
				{
					int A=a%10;
					int B=b%10;
						sum=sum+((A+B)%10)*k;
					k=k*10;
						if(a!=0)
					{
						a=a/10;
					}
					if(b!=0)
					{
							b=b/10;
					}
					//System.out.println(sum);
				}
				System.out.println(sum);
			}
			else
			{
				while(a>0)
				{
					int A=a%10;
					int B=b%10;
						sum=sum+((A+B)%10)*k;
					k=k*10;
						if(a!=0)
					{
						a=a/10;
					}
					if(b!=0)
					{
							b=b/10;
					}
					//System.out.println(sum);
				}
				System.out.println(sum);
			}
		}
	}
}