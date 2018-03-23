import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
import java.util.Arrays.*;
class code789
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i=0,j,k,l;
		t=scan.nextInt();
		//BigInteger B[]=new BigInteger[100000000];
//		BigInteger put=new BigInteger("1");
//		Arrays.fill(B,put);
		Double d=Math.pow(2,(t-1));
		int power=d.intValue();
		int A[]=new int[t];
		Double yu=0.0;
		for(int ui=0;ui<t;ui++)
		{
			A[ui]=scan.nextInt();
		}
		Long bi=1L;
		if(t==1)
		{

			//yu=Math.pow(2,(power*A[0]));
			for(Long hu=0L;hu<power*A[0];hu++)
			{
				bi=(bi*2)%1000000007;
			}
		}
		else if(t==2)
		{
			//yu=Math.pow(2,(power*A[0]));
			for(Long hu=0L;hu<power*A[0];hu++)
			{
				bi=(bi*2)%1000000007;
			}
			for(Long hu=0L;hu<power*A[1];hu++)
			{
				bi=(bi*3)%1000000007;
			}
			
		}
		else
		{
			for(Long hu=0L;hu<power*A[0];hu++)
			{
				bi=(bi*2)%1000000007;
			}
			for(Long hu=0L;hu<power*A[1];hu++)
			{
				bi=(bi*3)%1000000007;
			}
			int p=2;
			for(i=5;;i++)
			{
				int s=0;
				for(j=5;j*j<i;j=j+6)
				{
					if(i%j==0||i%(j+2)==0)
					{
						s=1;
					}
				}
				if(s==0)
				{
					//yu=Math.pow(i,(power*A[p]));
					for(Long hu=0L;hu<power*A[p];hu++)
					{
						bi=(bi*i)%1000000007;
					}
					p++;
				}
				if(p==t)
				{
					break;
				}
			}
		}
		int yus=bi.intValue();
		int m=0;
		for(int fg=1;fg<=Math.sqrt(yus);fg++)
		{
			if(yus%fg==0)
			{
				m++;
				if(fg!=yus/fg)
				{
					m++;
				}
			}
		}
		System.out.println(m);
	}
}