import java.util.Scanner;
class coinsspoj
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		for(i=0;i<10;i++)
		{
			n=scan.nextInt();
			if(n/2+n/3+n/4>n)
			{
				System.out.println(n/2+n/3+n/4);
			}
			else
			{
				System.out.println(n);
			}
		}
	}
}