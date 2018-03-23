import java.util.Scanner;
class loop
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int B[]=new int[770];
		int p=0;
		for(i=2;;i=i+10)
		{
			String str=Integer.toString(i);
			char A[]=str.toCharArray();
			k=str.length();
			l=0;
			for(j=0;j<k-1;j++)
			{
				if(A[j]=='2'||A[j]=='3'||A[j]=='5')
				{

				}
				else
				{
					l=1;
					break;
				}
			}
			if(A[k-1]!='2')
			{
				l=1;
			}
			if(l==0)
			{
				B[p]=i;
				B[p+1]=i+1;
				B[p+2]=i+3;
				p=p+3;
			}
			if(p==769)
			{
				break;
			}
		}
		t=scan.nextInt();
		System.out.println(B[t-1]);
	}
}