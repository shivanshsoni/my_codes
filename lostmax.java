import java.util.Scanner;
import java.util.Arrays;
class lostmax

{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t+1;i++)
		{
			if(i==0)
			{
				String str=scan.nextLine();
			}
			else
			{
			String str=scan.nextLine();
			String A[]=str.split(" ");
			int B[]=new int[A.length];
			for(j=0;j<A.length;j++)
			{	
				B[j]=Integer.parseInt(A[j]);
			}
			k=A.length;
			for(l=0;l<k;l++)
			{
				if(B[l]==k-1)
				{
					B[l]=0;
					break;
				}
			}
			Arrays.sort(B);
			System.out.println(B[k-1]);
		}
	}
}
}