import java.util.*;
class he18
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		k=str.length();
		String ptr[]=new String[k*(k+1)/2];
		l=0;
		for(i=0;i<k;i++)
		{
			for(j=1;j<=k-i;j++)
			{
				ptr[l]=str.substring(i,j+i);
				//System.out.println(ptr[l]);
				l++;
			}
		}
		t=scan.nextInt();
		Long m=0L;
		String b[]=new String[t];
		for(int a=0;a<t;a++)
		{
			b[a]=scan.next();
		}
		for(int c=0;c<l;c++)
		{
			char B[]=ptr[c].toCharArray();
			int o=0;
			for(int d=0;d<ptr[c].length();d++)
			{
			    String h=Character.toString(B[d]);
				for(int e=0;e<t;e++)
				{
					if(h.equals(b[e]))
					{
						o++;
					}
				}
				if(o==t)
				{
					m++;
				}
			}
		}
		System.out.println(m);
	}
}