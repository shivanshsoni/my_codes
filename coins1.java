import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static long a[]=new long[10000000];
	public static long anu(long n)
	{
		if(n==0||(n<a.length&&a[(int)(n)]!=0))
		{
	
		return a[(int)(n)];
		}
		else
		{
		long bb=(Math.max(n,anu((long)(Math.floor(n/2)))+anu((long)(Math.floor(n/3)))+anu((long)(Math.floor(n/4)))));
	    if(n<a.length)
	    {
		a[(int)(n)]=bb;
	    }
		return bb;
		}
	}
	public static void main (String[] args)throws IOException
	{
	
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		a[6]=6;
		Scanner sc=new Scanner(System.in);
		int t=0;
		while(sc.hasNextInt()&& t<10)
		{
			t++;
			long n=sc.nextLong();
			long l=anu(n);
			System.out.println(l);
			
		}
	}
} 