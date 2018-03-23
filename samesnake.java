import java.util.Scanner;
class samesnake
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,x12,x11,x21,x22,y11,y12,y21,y22;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			x11=scan.nextInt();
			y11=scan.nextInt();
			x12=scan.nextInt();
			y12=scan.nextInt();
			x21=scan.nextInt();
			y21=scan.nextInt();
			x22=scan.nextInt();
			y22=scan.nextInt();
			int ans=0;
			int a,b,c,d,e,a1,b1,c1,d1,e1;
			if(x12-x11>=0)
			{
				a=x12-x11;
			}
			else
			{
				a=x11-x12;
			}
			if(x21-x22>=0)
			{
				b=x21-x22;
			}
			else
			{
				b=x22-x21;
			}
			if(x22-x11>=0)
			{
				c=x22-x11;
			}
			else
			{
				c=x11-x22;
			}
			if(x21-x12>=0)
			{
				d=x21-x12;
			}
			else
			{
				d=x12-x21;
			}
			if(c>=d)
			{
				e=c;
			}
			else
			{
				e=d;
			}
			if(y12-y11>=0)
			{
				a1=y12-y11;
			}
			else
			{
				a1=y11-y12;
			}
			if(y21-y22>=0)
			{
				b1=y21-y22;
			}
			else
			{
				b1=y22-y21;
			}
			if(y22-y11>=0)
			{
				c1=y22-y11;
			}
			else
			{
				c1=y11-y22;
			}
			if(y21-y12>=0)
			{
				d1=y21-y12;
			}
			else
			{
				d1=y12-y21;
			}
			if(c1>=d1)
			{
				e1=c1;
			}
			else
			{
				e1=d1;
			}
			if(y11 == y12 && x21 == x22)
			{
   		 		if(x12 == x21 && (y11 == y21 || y11 == y22))
   		 		{ 
  		  		    ans = 1;
  		  		}
  		  		if(x11 == x21 && (y11 == y21 || y11 == y22))
    		    {
    		    	ans = 1;
    			}
  		  	}
  		  	if(y21 == y22 && x11 == x12)
 		   	{
 		   		if(x22 == x11 && (y21 == y11 || y21 == y12))
        		{	
        			ans = 1;
        		}
    			if(x21 == x11 && (y21 == y11 || y21 == y12))
        		{
        			ans = 1;
        		}
 		   	}	
    		if(y11 == y12 == y21== y22)
    		{
   				if(a+b+2>e+1)
   				{
      				ans = 1;
   				}
   			}
   			if(x11 == x12 == x21 == x22)
   			{ 
    			if(a1+b1+2>e1+1)
       			{ 
       				ans = 1
       			}
       		}
       		if(ans==1)
       		{
       			System.out.println()
       		}
       		else
       		{
       			System.out.println
       		}
		}
	}
}