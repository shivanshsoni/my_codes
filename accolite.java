import java.util.Scanner;
class accolite
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			if(str.length()==1)
			{
				System.out.println(str);
			}
			else
			{
			char A[]=str.toCharArray();
			if(str.length()%2==0)
			{
				StringBuilder ptr=new StringBuilder("");
				String mtr;
				mtr=Character.toString(A[0]);
				ptr.append(mtr);
				mtr=Character.toString(A[1]);
				ptr.append(mtr);
				for(k=2;k<str.length();k++)
				{
					if(k%2==0)
					{
						ptr.reverse();
						mtr=Character.toString(A[k]);
						ptr.append(mtr);
						ptr.reverse();
					}
					else
					{
						mtr=Character.toString(A[k]);
						ptr.append(mtr);
					}
				}
				System.out.println(ptr.toString());
			}
			else
			{
				StringBuilder ptr=new StringBuilder("");
				String mtr;
				mtr=Character.toString(A[0]);
				ptr.append(mtr);
				for(k=1;k<str.length();k++)
				{
					if(k%2!=0)
					{
						ptr.reverse();
						mtr=Character.toString(A[k]);
						ptr.append(mtr);
						ptr.reverse();
					}
					else
					{
						mtr=Character.toString(A[k]);
						ptr.append(mtr);
					}
				}
				System.out.println(ptr.toString());
			}
			}
		}
	}
}