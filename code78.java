import java.util.Scanner;
class code78
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String str[]=new String[n];
			for(j=0;j<n;j++)
			{
				str[j]=scan.next();
			}
			
			String ptr[]=new String[7];
			ptr[0]="cakewalk";
			ptr[1]="simple";
			ptr[2]="easy";
			ptr[3]="easy-medium";
			ptr[4]="medium";
			ptr[5]="medium-hard";
			ptr[6]="hard";
			int m=0;
			for(l=0;l<n;l++)
			{
				if(str[l].equals(ptr[0]))
				{
					m++;
					break;
				}
			}
			for(l=0;l<n;l++)
			{
				if(str[l].equals(ptr[1]))
				{
					m++;
					break;
				}
			}
			for(l=0;l<n;l++)
			{
				if(str[l].equals(ptr[2]))
				{
					m++;
					break;
				}
			}
			for(l=0;l<n;l++)
			{
				if(str[l].equals(ptr[3])||str[l].equals(ptr[4]))
				{
					m++;
					break;
				}
			}
			for(l=0;l<n;l++)
			{
				if(str[l].equals(ptr[5])||str[l].equals(ptr[6]))
				{
					m++;
					break;
				}
			}
			if(m==5)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}