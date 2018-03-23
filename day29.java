import java.util.Scanner;
import java.util.Arrays;
class day29
{
	public static void main(String[]nbc)
	{
		Scanner scan=new Scanner(System.in);
		int p=0,t,i,j,k,l;
		t=scan.nextInt();
		String str[]=new String[t];
		for(i=0;i<t;i++)
		{
			str[i]=scan.next();
			String ptr=scan.next();
			j=ptr.length();
			char B[]=ptr.toCharArray();
			p=0;
			for(k=0;k<j-5;k++)
			{
				if(B[k]=='g'&&B[k+1]=='m'&&B[k+2]=='a'&&B[k+3]=='i'&&B[k+4]=='l')
				{
					p++;
					break;
				}
			}
			if(p==0)

			{
				str[i]="qaz";
			}
		}
		String htr[]=new String[t-p];
		int m=0;
		for(l=0;l<t;l++)
		{
			if(str[l].equals("qaz"))
			{

			}
			else
			{
				htr[m]=str[l];
				m++;
			}
		}
		Arrays.sort(htr);
		for(int y=0;y<t-p;y++)
		{
				System.out.println(htr[y]);
		}
	}
}