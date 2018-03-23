import java.util.Scanner;
public class Hongcow_Learns_the_Cyclic_Shift
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		char i,k;
		int j,m;
		String str;
		str=scan.next();
		m=str.length();
		char [] A=str.toCharArray();
		int p=0;
		for(i='a';i<='z';i++)
		{
			int y=0;
			for(j=0;j<m;j++)
			{
				if(A[j]==i)
				{
					p++;
					break;
				}
			}
			
		}
		System.out.println(p);
	}
}