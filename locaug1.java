import java.util.Scanner;
class locaug1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(j=0;j<t;j++)
		{
			String str=scan.next();
			int p=0;
			String ptr;
			for(k=0;k<str.length();k++)
			{
				for(l=1;l<=str.length()-k;l++)
				{
					ptr=str.substring(k,l+k);
					if(ptr.length()>1)
					{
						StringBuilder htr=new StringBuilder(ptr);
						String mtr=htr.reverse().toString();
						if(ptr.equals(mtr))
						{
							p=1;
							break;
						}
					}
				}
				if(p==1)
				{
					break;
				}
			}
			if(p==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}