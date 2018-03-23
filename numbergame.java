import java.util.Scanner;
class numbergame
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			j=scan.nextInt();
			if(j%4!=1)
			{
				System.out.println("BOB");
			}
			else
			{
				System.out.println("ALICE");
			}
		}
	}
}