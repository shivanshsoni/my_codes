import java.util.Scanner;
import java.util.Arrays;
class palingam2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			String ptr=scan.next();
			if(str.length()>26)
			{
				System.out.println("A");
			}
			else
			{
				char A[]=str.toCharArray();
				char B[]=ptr.toCharArray();
				Arrays.sort(A);
				int m=0;
				for(j=0;j<str.length()-1;j++)
				{
					if(A[j]==A[j+1])
					{
						m=1;
					}
				}
				if(m==1)
				{
					System.out.println("A");
				}
				else
				{
					System.out.println("B");
				}
			}
		}
	}
}