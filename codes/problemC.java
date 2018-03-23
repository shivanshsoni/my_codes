import java.util.Scanner;
class problemC
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;
		String str,ptr;
		str=scan.next();
		i=str.length();
		ptr=scan.next();
		j=ptr.length();
		char A[]=str.toCharArray();
		char B[]=ptr.toCharArray();
		
		int C[]=new int[i];
		for(int g=0;g<i;g++)
		{
			C[g]=scan.nextInt();
		} 
		for(k=0;k<i;k++)
		{
			l=C[k];
			int m=0;
			int n=0;

			for(int u=0;u<i;u++)
			{
				if(A[l-1]==A[u])
				{
					m++;
				}
			}
			for(int y=0;y<j;y++)
			{
				if(A[l-1]==B[y])
				{
					n++;
				}
			}
			if(m<=n)
			{
				break;
			}
			else
			{
					A[l-1]='7';
			}

		}
		System.out.println(k+1);
	}
}