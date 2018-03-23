import java.util.Scanner;
public class cont26a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(l=0;l<2;l++)
		{
			if(l==0)
			{

				String str=scan.nextLine();
				String ptr[]=str.split(" ");	
			}
			else
			{
				String str=scan.nextLine();
				String ptr[]=str.split(" ");
				int p=0;
				for(i=0;i<ptr.length;i++)
		{
			char A[]=ptr[i].toCharArray();
			int m=0;
			for(j=0;j<A.length;j++)
			{
				if(A[j]=='A'||A[j]=='B'||A[j]=='C'||A[j]=='D'||A[j]=='E'||A[j]=='F'||A[j]=='G'||A[j]=='H'||A[j]=='I'||A[j]=='J'||A[j]=='K'||A[j]=='L'||A[j]=='M'||A[j]=='N'||A[j]=='O'||A[j]=='P'||A[j]=='Q'||A[j]=='R'||A[j]=='S'||A[j]=='T'||A[j]=='U'||A[j]=='V'||A[j]=='W'||A[j]=='X'||A[j]=='Y'||A[j]=='Z')
				{
					m++;
				}
			}
			if(p<m)
			{
				p=m;
			}
		}
		System.out.println(p);	
			}
		}
	}
}