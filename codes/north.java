import java.util.Scanner;
public class north
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		j=0;
		l=0;
		String str="a";
		int y=0,p=0;
		for(i=0;i<n;i++)
		{
			k=scan.nextInt();
			str=scan.next();
			if(str.equals("South"))
			{
				j=j+k;
				p++;
			}
			if(str.equals("North"))
			{
				l=l+k;
				y++;
			}
		}
		//System.out.println(j + str +n);
		if(j<=l&&str.equals("North")&&p!=y&&j==20000)
		{
			System.out.println("YES");
		}
		else if(j<=l&&str.equals("North")&&(j<20000||j>=20000))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}