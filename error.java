import java.util.Scanner;
class error
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			k=str.length();
			int A[]=new int[k];
			for(int h=0;h<k;h++)
			{
				A[h]=Integer.parseInt(String.valueOf(str.charAt(h)));
			}
			l=0;
			for(j=0;j<k-2;j++)
			{
				if(A[j]==0&&A[j+1]==1&&A[j+2]==0||A[j]==1&&A[j+1]==0&&A[j+2]==1)
				{
					l++;
				}
			}
			if(l>0)
			{
				System.out.println("Good");
			}
			else
			{
				System.out.println("Bad");
			}
		}
	}
}