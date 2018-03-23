import java.util.Scanner;
class byteland
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		//for(i=0;i<10;i++)
		//{
			n=scan.nextInt();
			j=n/2+n/3+n/4;
			if(j>n)
			{
				System.out.println(j);
			}
			else
			{
				System.out.println(n);
			}
		//}
	}
}