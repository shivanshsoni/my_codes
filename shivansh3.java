import java.util.Scanner;
import java.util.Arrays;
public class shivansh3
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int m=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		for(j=0;j<t;j++)
		{
			int p=0;
			for(l=j;l<t;l++)
			{
				if(A[j]==A[l])
				{
					p++;
				}
				else
				{
					break;
				}
			}
			if(m<p)
			{
				m=p;
			}
		}
		System.out.println(m);
	}
}