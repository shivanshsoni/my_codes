import java.util.Scanner;
class hackerrank2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String str,ptr,mtr,str1,str2;
		str="min(int,int)";
		ptr="min(int,";
		mtr=")";
		str1="";
		int n=scan.nextInt();
		if(n==2)
		{
			System.out.println(str);
		}
		else
		{
			for (int i=2;i<n;i++)
			{
				str1=ptr.concat(str);
				str1=str1.concat(mtr);
				str=str1;
			}
			System.out.println(str1);
		}

	}
}