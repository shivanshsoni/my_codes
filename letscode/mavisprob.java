import java.util.Scanner;
import java.util.Arrays;
class mavisprob
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int i,j,k,l;
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<t;j++)
		{
			int m=0;
			for(k=j+1;k<t;k++)
			{
				if(A[j]>A[k])
				{
					m++;
				}
			}
			System.out.print(m+" ");
		}
	}
}