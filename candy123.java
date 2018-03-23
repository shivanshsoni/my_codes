import java.util.Scanner;
class candy123
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,a,b,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			j=1;
			while(a>=0&&b>=0)
			{
				if(j%2!=0)
				{
					a=a-j;	
				}
				else
				{
					b=b-j;
				}
				j++;
			}
			if(a<0)
			{
				System.out.println("Bob");
			}
			else
			{
				System.out.println("Limak");
			}
		}
	}
}