import java.util.Scanner;
class code65
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int cn, min,t=0,tc,c=1,p,t1,v=0;
		int n,i,j;
		int a[]=new int[10000001];
		int b[]=new int[10000001];
		int m[]=new int[10000001];
		int x[]=new int[10000001];
    	t1=scan.nextInt();
    	for(int g=0;g<t1;g++)
    	{
    		n=scan.nextInt();
    		cn=0;
    		for(i=0;i<n;i++)
    		{
    			a[i]=scan.nextInt();
    		}
    		for(i=0;i<n;i++)
    		{
    			b[i]=scan.nextInt();
    		}
    		for(i=0;i<n;i++)
    		{
    			m[i]=a[i]%b[i];
    		}
    		for(i=0;i<n;i++)
    		{
    			x[i]=m[i];
    		}
    		p=m[0];
    		c=1;
    	 	for (i=0;i<n;i++)
        	{
            	tc = 0;
            	t=m[i];
            	tc++;
            	    for(j=i+1;j<n;j++)
            	{
            	    if(m[j] == t)
            	    {
            	        tc++;
            	        if(tc > c)
            	        {
            	            p = t;
            	        c= tc;
            	        }
            	    }
            	}
        	}
        	for(i=0;i<n;i++)
        	{
        		if(p==m[i])
        		v++;
        	}
        	if(v<=1)
        	{
        		min=99999999;
        		for(i=0;i<n;i++)
        		{
        			if(m[i]<min)
        			min=m[i];
        		}
        	}
     
        	for(i=0;i<n;i++)
        	{
        		if(m[i]!=p)
        		{
        			while(a[i]%b[i]!=p)
        			{
    					cn++;
    					a[i]=a[i]+1;
    				}
        		}
     	
        	}
       		System.out.println(cn);
     
    	}
	}
}