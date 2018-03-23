import java.util.Scanner;
public class codeA
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str[]=new String[t];
		for(i=0;i<t;i++)
		{
			str[i]=scan.next();
			int p=0;
			for(j=0;j<i;j++)
			{
				if(str[j].equals(str[i]))
				{
					p=1;
					break;
				}
			}
			if(p==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}