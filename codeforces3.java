import java.util.Scanner;
public class codeforces3
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		Long t,n,i,j,k,l;
		t=scan.nextLong();
		n=scan.nextLong();
		i=0L;
		l=t;
		
		for(int m=0;;m++)
		{
			t=t-i;
			if(t<=0)
			{
				break;
			}
			//System.out.println(t);
			if(t+n>l)
			{
				t=l;
			}
			if(t+n<=l)
			{
				t=t+n;
			}
			i++;
		}
		System.out.println(i);
	}
}