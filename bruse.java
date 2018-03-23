import java.util.Scanner;
public class bruse
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;
		i=scan.nextInt();
		j=scan.nextInt();
		for(l=1;l<=10;l++)
		{
			k=l*i;
			if(k%10==j||k%10==0)
			{
				System.out.println(l);
				break;
			}
		}
	}
}