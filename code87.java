import java.util.Scanner;
import java.math.*;
class code87
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Long A[]=new Long[t];
		if(t==1)
		{
			A[0]=2L;
		}
		else if(t==2)
		{
			A[0]=2L;
			A[1]=3L;
		}
		else
		{
			A[0]=2L;
			A[1]=3L;
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
					A[p]=i+0L;
					p++;
				}
				if(p==t)
				{
					break;
				}
			}
		}
		Long bi=1L;
		int o=0;
		for(k=0;k<t;k++)
		{
			l=scan.nextInt();
			o=o+l;
			Double r=Math.pow(A[k],l);
			A[k]=r.longValue();
			bi=bi*A[k];
		}
		Long hi=1L;
		if(o!=t)
		{
			for(int y=0;y<o-1;y++)
			{
				hi=hi*bi;
			}
			bi=hi;
		}
		else
		{
			for(int y=0;y<t-1;y++)
			{
				bi=bi*bi;
			}
			
		}
		//System.out.println(bi);
		Long numberOfFactors = 1L;

   		if (bi==1)  
   		{
    	   numberOfFactors=1L;
    	}
    	else
    	{

   			Long boundry = bi/2;
   			Long counter = 2L;

		    while (counter<=boundry) 
		    {
    		    if (bi%counter==0) 
    		    {
    	        	numberOfFactors++;
    	    	}

        		counter++;
   			}

  			numberOfFactors++;
  		}
		System.out.println(numberOfFactors%1000000007);
	}
}