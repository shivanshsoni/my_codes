import java.util.Scanner;
class jumps
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		long a,i,j,k;
		a=scan.nextLong();
		i=a%6;
		if(i==3L||i==1L||i==0L)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}