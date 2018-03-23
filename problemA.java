import java.util.Scanner;
public class problemA
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;
		String str=scan.next();
		j=str.length();
		char A[]=str.toCharArray();
		int s=0;
		k=0;
		for(i=0;i<j-1;i++)
		{
			if(A[i]=='V'&&A[i+1]=='K')
			{
				s++;
			}
			if(j>2)
			{
				if(A[i]=='V'&&A[i+1]=='V'&&A[i+2]=='V'&&i<=j-2)
				{
					k=1;
				}
			}
			else
			{
				if(A[0]=='V'&&A[1]=='V')
				{
					k=1;
				}
			}
		}
		if(k==1)
		{
			s++;
		}
		System.out.println(s);
	}
}