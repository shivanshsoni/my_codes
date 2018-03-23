import java.util.Scanner;
class prefix
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b;
		String str=scan.next();
		t=str.length();
		int p=0;
		int o=0;
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
			if(A[i]==1&&o==i)
			{
				o++;
			}
		}
		l=0;
		for(j=0;j<t-1;j++)
		{
			if(A[j]==0&&A[j+1]==1)
			{
				l++;
			}
		}
		if(o>=1)
			System.out.println(l*2+1);	
		else
			System.out.println(l*2);
	}
}