import java.util.Scanner;
class santa2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		String str,ptr;
		str=scan.next();
		char A[]=str.toCharArray();
		ptr=scan.next();
		char B[]=ptr.toCharArray();
		i=str.length();
		l=0;
		char C[]=new char[i+i];
		for(j=0;j<i;j++)
		{
			if(A[j]!=B[j])
			{
				for(int y=0;y<j;y++)
				{
					if(A[j]==A[y]||A[j]==B[y])
					{
						break;
					}
					else
					{
						C[l]=A[j];
						C[l+1]=B[j];
						l=l+2;
						break;
					}
				}
			}
		}
		System.out.println((l-2)/2);
		for(int s=0;s<l;s=s+2)
		{
			System.out.printf("%c %c",A[s],A[s+1]);
		}
	}
}