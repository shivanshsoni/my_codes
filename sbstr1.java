import java.util.Scanner;
class sbstr1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		for(int y=0;y<24;y++)
		{
		String str=scan.next();
		String ptr=scan.next();
		int A[]=new int[10];
		int B[]=new int[5];
		for(i=0;i<10;i++)
		{
			A[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		for(j=0;j<5;j++)
		{
			B[j]=Integer.parseInt(String.valueOf(ptr.charAt(j)));
		}
		l=0;
		int p=0;
		for(k=0;k<6;k++)
		{
			if(A[k]==B[l]&&A[k+1]==B[l+1]&&A[k+2]==B[l+2]&&A[k+3]==B[l+3]&&A[k+4]==B[l+4])
			{
				p=1;
				break;
			}
		}
		if(p==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
}
}