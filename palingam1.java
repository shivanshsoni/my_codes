import java.util.Scanner;
import java.util.Arrays;
class palingam1
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			String ptr=scan.next();
			char A[]=str.toCharArray();
			char B[]=ptr.toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
			k=str.length();
			int a=0;
			int p=0;
			int b=0;
			int ab=0;
			int ba=0;
			int c=0;
			int d=0;
			int e=0;
			int m=0;
			for(char jd='a';jd<='z';jd++)
			{
				a=0;
				b=0;
				for(l=0;l<k;l++)
				{
					if(A[l]==jd)
					{
						a++;
					}
					if(B[l]==jd)
					{
						b++;
					}
				}
				if(a>0&&b>0)
				{
					e++;
				}
				if(a>=1&&b==0)
				{
					p++;
				}
				if(b>0&&a==0)
				{
					m++;
				}
				if(a>=2&&b==0)
				{
					ab=1; 
				} 
			}
			if(e>0&&p==1&&m==0)
			{
				System.out.println("A");
			}
			else if(ab==1)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("B");
			}
		}
	}
}