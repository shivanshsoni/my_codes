import java.util.Scanner;
import java.util.Arrays;
class chefandhischaracter
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			str=str.toLowerCase();
			char A[]=str.toCharArray();
			char B[]=new char[4];
			int m=0;
			for(j=0;j<str.length()-3;j++)
			{
				B[0]=A[j];
				B[1]=A[j+1];
				B[2]=A[j+2];
				B[3]=A[j+3];
				Arrays.sort(B);
				if(B[0]=='c'&&B[1]=='e'&&B[2]=='f'&&B[3]=='h')
				{
					m++;
				}
			}
			if(m>0)
			{
				System.out.println("lovely"+" "+m);
			}
			else
			{
				System.out.println("normal");
			}
		}
	}
}