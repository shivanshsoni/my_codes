import java.util.Scanner;
import java.util.Arrays;
public class prob835b
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str=scan.next();
		int A[]=new int[str.length()];
		int sum=0;
		for(i=0;i<str.length();i++)
		{
			A[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
			sum=sum+A[i];
		}
		Arrays.sort(A);
		int m=0;
		if(sum>=t)
		{
			System.out.println("0");
		}
		else
		{
			l=0;

			int p=0;
			while(p<t-sum)
			{
				j=9-A[l];
				p=p+j;
				l++;
				if(j>0)
				{
					m++;
				}
			}
			System.out.println(m);
		}
		
	}
}