import java.util.Scanner;
import java.util.Arrays;
public class pokemon
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str;
		str=scan.next();
		k=str.length();
		char A[]=str.toCharArray();
		int B[]=new int[7];
		B[0]=0;
		B[1]=0;
		B[2]=0;
		B[3]=0;
		B[4]=0;
		B[5]=0;
		B[6]=0;
		
		for(i=0;i<k;i++)
		{
			if(A[i]=='B')
			{
				B[0]++;
			}
			if(A[i]=='u')
			{
				B[1]++;
			}
			if(A[i]=='l')
			{
				B[2]++;
			}
			if(A[i]=='b')
			{
				B[3]++;
			}
			if(A[i]=='a')
			{
				B[4]++;
			}
			if(A[i]=='s')
			{
				B[5]++;
			}
			if(A[i]=='r')
			{
				B[6]++;
			}
		}
		B[1]=B[1]/2;
		B[4]=B[4]/2;
		Arrays.sort(B);
		System.out.println(B[0]);
	}
}