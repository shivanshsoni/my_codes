import java.util.Scanner;
import java.util.Arrays;
class code3
{
	public static void main(String[]atsf)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str=scan.next();
		String ptr=scan.next();
		int A[]=new int[t];
		int B[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		for(j=0;j<t;j++)
		{
			B[j]=Integer.parseInt(String.valueOf(ptr.charAt(j)));
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int m=0;
		for(k=0;k<t;k++)
		{
			if(A[k]<B[k])
			{
				m++;
			}
		}
		System.out.println(m);
		m=0;
		for(k=0;k<t;k++)
		{
			for(l=0;l<t;l++)
			{
				if(B[l]>A[k])
				{
					B[l]=0;
					m++;
					break;
				}
			}
		}
		System.out.println(m);
	}	
}