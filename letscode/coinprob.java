import java.util.Scanner;
class coinprob
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			if(k==1)
			{
				System.out.println("2");
			}
			else if(k==2)
			{
				System.out.println("4");
			}
			else if(k==3)
			{
				System.out.println("7");
			}
			else if(k==4)
			{
				System.out.println("13");
			}
			else
			{
				Long h=1L;
				for(l=0;l<k-4;l++)
				{
					h=(h*2L)%1000000007;
				}				
				int y=17-k;
				System.out.println((y*h)%1000000007);
			}
		}
	}
}