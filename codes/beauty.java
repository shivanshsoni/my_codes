import java.util.Scanner;
class beauty
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		char A[]=str.toCharArray();
		i=str.length();
		k=0;
		for(j=0;j<i-1;j++)
		{
			if((A[j]=='a'||A[j]=='e'||A[j]=='i'||A[j]=='o'||A[j]=='u'||A[j]=='y')&&(A[j+1]=='a'||A[j+1]=='e'||A[j+1]=='i'||A[j+1]=='o'||A[j+1]=='u'||A[j+1]=='y'))
			{
				k=1;
				break;
			}
			if(A[j]==A[j+1])

			{
				k=1;
				break;
			}
		}
		if(k==1)
		{
			System.out.println("No");
		}
		else
		{
				System.out.println("Yes");
		}
	}
}