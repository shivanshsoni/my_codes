import java.util.Scanner;
class gift
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,l;
		t=scan.nextInt();
		long k;
		for(i=0;i<t;i++)
		{
			k=scan.nextLong();
			if(k>=4)
			{
				if(k%2==0)
				{
					System.out.println(k-2);
				}
				else
				{
					System.out.println(k-3);
				}
			}
			if(k<4)
			{
				System.out.println("2");
			}
		}
	}
}