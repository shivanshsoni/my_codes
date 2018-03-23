import java.util.Scanner;
import java.util.Arrays;
class rectangle
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(j=0;j<t;j++)
		{
			int A[]=new int[4];
			for(i=0;i<4;i++)
			{
				A[i]=scan.nextInt();
			}
			Arrays.sort(A);
			if(A[0]==A[1]&&A[2]==A[3])
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}