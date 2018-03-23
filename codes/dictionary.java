import java.util.Scanner;
class dictionary
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str[]=new String[t];
		int B[]=new int[t];
		for(i=0;i<t;i++)
		{
			str[i]=scan.next();
			B[i]=scan.nextInt();
		}
		for(j=0;;j++)
		{
			String ptr=scan.next();
			int m=0;
			for(k=0;k<t;k++)
			{
				if(str[k].equals(ptr))
				{
					System.out.printf("%s=%d\n",ptr,B[k]);
					m++;
					break;
				}
			}
			if(m==0)
			{
				System.out.println("Not found");
			}
		}
	}
}