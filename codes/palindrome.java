import java.util.Scanner;
import java.util.Arrays;
class palindrome

{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b,c;
		String str;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			j=str.length();
			char [] A=str.toCharArray();
			char B[]=new char[j];
			char C[]=new char[j];
			if(j%2==0)
			{
				for(k=0;k<j/2;k++)
				{
					B[k]=A[k];
				}
				a=0;
				for(l=j/2+1;l<j;l++)
				{
					C[a]=A[l];
					a++;
				}
				Arrays.sort(B);
				Arrays.sort(C);
				for(int y=0;y<a;y++)
				{
						System.out.println(B[y]);
						System.out.println(C[y]);
				}
				c=0;
				for(b=0;b<j/2;b++)
				{
					if(B[b]==C[j/2+1])
					{
						c++;
					}
				}
				if(c==j/2)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				for(k=0;k<j/2;k++)
				{
					B[k]=A[k];
				}
				a=0;
				for(l=j/2;l<j;l++)
				{
					C[a]=A[l];
					a++;
				}
				Arrays.sort(B);
				Arrays.sort(C);
				c=0;
				for(b=0;b<j/2;b++)
				{
					if(B[b]==C[j/2+1])
					{
						c++;
					}
				}
				if(c==j/2)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
	}
}