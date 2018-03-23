import java.util.Scanner;
class palindrome
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=n;
			while(k!=0)
			{
				k=k%10;
			}
		}
	}
}