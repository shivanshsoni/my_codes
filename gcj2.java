import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
import java.io.*;
public class gcj2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t,i,j,k,l;
		String str,ptr,mtr;
		BigInteger n,m;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			str=scan.next();
			n=new BigInteger(str);
			m=new BigInteger("1");
			while(true)
			{

				System.out.println(str);
				j=n.toString().length();	
				int A[]=new int[j];
				ptr="";
				mtr="";
				for(k=0;k<j;k++)
				{
					A[k]=Integer.parseInt(String.valueOf(str.charAt(k)));
					ptr=ptr.concat(Integer.toString(A[k]));
				}
				Arrays.sort(A);
				for(int y=0;y<j;y++)
				{
					mtr=mtr.concat(Integer.toString(A[y]));
				}
				if(mtr.equals(ptr))
				{
					System.out.println("Case #"+(i+1)+":"+" "+n);
					break;
				}
				else
				{
					n=n.subtract(m);
					str=n.toString();
				}
			}
		}
	}
}