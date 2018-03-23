import java.util.Scanner;
class life
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;
		for(j=0;;j++)
		{
			i=scan.nextInt();
			if(i!=42)
			{
				System.out.println(i);
			}
			else
			{
				break;
			}
		}
	}
}