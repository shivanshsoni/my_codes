import java.util.Scanner;
public class encoding
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		String str;
		str=scan.next();
		char[] A=str.toCharArray();
		char B[]=new char[t];
		
		if(t%2!=0)
		{
			j=t/2-1;
			k=t/2;
			for(i=1;i<t;i=i+2)
			{
				B[j]=A[i];
				B[k]=A[i-1];
				j--;
				k++;
			}
			B[t-1]=A[t-1];
			for(int p=0;p<t;p++)
			{
				System.out.printf("%c",B[p]);
			}
		}
		else
		{
			j=t/2-1;
			k=t/2;
			for(i=0;i<t;i=i+2)
			{
				B[j]=A[i];
				B[k]=A[i+1];
				j--;
				k++;
			}
			for(int y=0;y<t;y++)
			{
				System.out.printf("%c",B[y]);
			}
		}
		
		
	}
}