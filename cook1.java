import java.util.Scanner;
class cook1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str[]=new String[4];
			int A[]=new int[4];
			for(j=0;j<4;j++)
			{
				str[j]=scan.next();
				A[j]=scan.nextInt();
			}
			int a=0;
			int b=0;
			for(k=0;k<4;k++)
			{
				for(l=0;l<4;l++)
				{
					if(str[k].equals("Barcelona")&&str[l].equals("Eibar"))
					{
						a=A[k]-A[l];
					}
					if(str[k].equals("RealMadrid")&&str[l].equals("Malaga"))
					{
						b=A[k]-A[l];
					}
				}
			}
			if(b<0&&a>0)
			{
				System.out.println("Barcelona");
			}
			else
			{
				System.out.println("RealMadrid");
			}
		}
	}
}