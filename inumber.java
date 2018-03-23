import java.util.Scanner;
class inumber
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			j=1;
			for(int y=1;;y++)
			{
				j=k*y;
				int sum=0;
				String str=Integer.toString(j);
				int A[]=new int[str.length()];
				for(int a=0;a<str.length();a++)
				{
					A[a]=Integer.parseInt(String.valueOf(str.charAt(a)));
					sum=sum+A[a];
				}
				if(k==sum)
				{
					break;
				}
			}
			System.out.println(j);
		}
	}
}