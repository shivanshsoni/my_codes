import java.util.Scanner;
public class problemB
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,i,j,l,p;
		String str;
		str=scan.next();
		k=scan.nextInt();
		n=str.length();
		l=Integer.parseInt(str);
		if(n<k)
		{
			p=0;
			for(i=0;i<n;i++)
			{
				if(l%10==0)
				{
					p++;
				}
				l=l/10;
			}
			if(p!=0)
			{
				System.out.println(n-1);
			}
			else
			{
				System.out.println(n);
			}
		}
		else
		{
			j=0;
			int h=0;
			while(j!=k)
			{
				if(l%10==0)
				{
					j++;
				}
				l=l/10;
				h++;
			}
			System.out.println(h-j);
		}
	}
}