import java.util.Scanner;
public class krill
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		l=scan.nextInt();
		int r=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();
		k=scan.nextInt();
		int p=0;
		if(r/x>=k&&l/y<=k)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}