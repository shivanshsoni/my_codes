import java.util.Scanner;
import java.util.Arrays;
class killkhiljee
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		int p=0;
		for(j=0;j<str.length();j++)
		{
			for(l=1;l<=str.length()-j;l++)
			{
				p++;
			}
		}
		String ptr[]=new String[p];
		p=0;
		for(j=0;j<str.length();j++)
		{
			for(l=1;l<=str.length()-j;l++)
			{
				ptr[p]=str.substring(j,j+l);
				p++;
			}
		}
		Arrays.sort(ptr);
		StringBuilder mtr=new StringBuilder("");
		for(int e=0;e<p;e++)
		{
			//System.out.println(ptr[e]);
			String htr=ptr[e];
			mtr=mtr.append(htr);
		}
		String ytr=mtr.toString();
		char C[]=ytr.toCharArray();
		//System.out.println(ytr);
		t=scan.nextInt();
		int g=0;
		int fs=0;
		for(i=0;i<t;i++)
		{
			fs=0;
			int a=scan.nextInt();
			int b=scan.nextInt();
			fs=((a%b)*(g%b))%b;
			g=g+(int) C[fs];
			//fg=fg;
			//int gf=(int) (long) fg;
			//int sun=(int) C[gf-1];
			//long dui=sun;
			//System.out.println(dui);
			System.out.println(C[fs]);
		}
	}
}