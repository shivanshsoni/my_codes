import java.util.Scanner;
public class shivansh2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int h1,h2,a1,a2,c1;
		h1=scan.nextInt();
		a1=scan.nextInt();
		c1=scan.nextInt();
		h2=scan.nextInt();
		a2=scan.nextInt();
		int m=0;
		String str[]=new String[100];
		while(h2>0)
		{
			h2=h2-a1;
			str[m]="STRIKE";
			m++;
			if(h2<=0)
			{
				break;
			}
			if(h1<=a2)
			{
				str[m]="HEAL";
				m++;
				h1=h1+c1;
			}
			h1=h1-a2;
		}
		System.out.println(m);
		for(j=0;j<m;j++)
		{
			System.out.println(str[j]);
		}
	}
}