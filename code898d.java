import java.util.Scanner;
import java.util.Arrays;
public class code898d
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		l=0;
		for(i=0;i<t-1;i++)
		{
			if(A[i+1]-A[i]<=b)
			{
				for(int y=i+1;y<t;y++)
				{
					if(A[y]-A[i]<=a)
					{
						l++;
						//System.out.println
					}
					else
					{
						i=y;
						break;
					}
				}
			}
		}
		System.out.println(l);
	}
}