import java.util.Scanner;
class toandfro
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=1;
		while(n!=0)
		{
			n=scan.nextInt();
			if(n==0)
			{
				break;
			}
			else
			{
				String str=scan.next();
				j=str.length();
				char A[]=str.toCharArray();
				for(i=0;i<j/n;i++)
				{
					for(k=i;k<j;k=k+9-i)
					{
						if(k==i)
						{
							System.out.println()
						}
						System.out.printf("%c%c",A[k],A[k+1]);
					}
				}
			}
		}	
	}
}