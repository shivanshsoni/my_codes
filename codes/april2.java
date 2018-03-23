import java.util.Scanner;
class april2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str[]=new String[4];
			String ptr[]=new String[4];
			for(j=0;j<4;j++)
			{
				str[j]=scan.next();
			}
			int m=0;
			for(k=0;k<4;k++)
			{
				ptr[k]=scan.next();
				for(l=0;l<4;l++)
				{
					if(str[l].equals(ptr[k]))
					{
						m++;
						break;
					}
				}
			}
		
			if(m>=2)
			{
				System.out.println("similar");
			}
			else
			{
				System.out.println("dissimilar");
			}
		}
	}
}