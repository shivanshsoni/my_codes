import java.util.Scanner;
class url
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<=t;i++)
		{
			if(i>0)
			{
				String str=scan.nextLine();
				String ptr[]=str.split(" ");
				StringBuilder mtr=new StringBuilder(ptr[0]);
				for(j=0;j<ptr.length;j++)
				{
					mtr.append(ptr[j]);
					if(j<ptr.length-1)
					{
						mtr.append("%20");
					}
				}
				System.out.println(mtr.toString());
			}
			else
			{
				String str=scan.next();
			}
		}
	}
}