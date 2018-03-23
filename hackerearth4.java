import java.util.Scanner;
import java.util.Arrays;
class hackerrank6
{
	public static void main(String[]args)
	{
			Scanner scan=new Scanner(System.in);
			int t,i,j,k,l;
			t=scan.nextInt();
			int A[]=new int[t];
			for(i=0;i<t;i++)
			{
				l=0;
				for(j=0;j<t;j++)
				{
					k=scan.nextInt();
					if(k==1)
					{
						l++;
					}
					A[j]=l;
				}
			}
			Arrays.sort(A);
	}
}