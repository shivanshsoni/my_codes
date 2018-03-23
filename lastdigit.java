import java.util.Scanner;
class lastdigit
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			l=scan.nextInt();
			if(k==1||k==11||k==5||k==15||k==6||k==16||k==10||k==20)
			{
				System.out.println(k%10);
			}
			if(k==2||k==12||k==7||k==17||k==8||k==18||k==3||k==13)
			{
				if(l%4==0)
				{
					System.out.println(k*4%10);
				}
				if(l%4==1)
				{
					System.out.println(k%10);
				}
				if(l%4==2)
				{
					System.out.println(k*2%10);
				}
				if(l%4==3)
				{
					System.out.println(k*3%10);
				}
			}
			
			if(k==4||k==14||k==9||k==19)
			{
				if(l%2==0)
				{
					System.out.println(k*2%10);
				}
				else
				{
					System.out.println(k%10);
				}
			}
		}
	}
}