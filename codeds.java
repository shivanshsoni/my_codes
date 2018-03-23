import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
import java.util.*;
class codeds
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,q,l;
		n=scan.nextInt();
		q=scan.nextInt();
		TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>();
 
		for(int i=0;i<n;i++)
		{
			int a=scan.nextInt();
		    int b=scan.nextInt();
		    hs.put(a,b);
		}
 
		for(int j=0;j<q;j++)
		{
			int c=scan.nextInt();
			int d=scan.nextInt();
			int e=scan.nextInt();
			int f=scan.nextInt();
 
			if(c==e&&d==f)
			{
				System.out.println("0");
			}
 
			else if(c==e)
		   	{
			    System.out.println(Math.abs(d-f));
			}
 
			else if(Math.abs(c-e)==1)
			{
		    	System.out.println(Math.abs(d-f)+1);
		   	}
 
			else
			{
				int max1=-1;
 
				if(c<e)
				{
					SortedMap<Integer,Integer> sorted = hs.subMap(c,e+1);
					max1=sorted.values().stream().max(Integer::compare).get();
					//System.out.println(s);
					//max1=sorted.get(s);
				}
 
				else
				{
					SortedMap<Integer,Integer> sorted = hs.subMap(e,c+1);
					max1=sorted.values().stream().max(Integer::compare).get();
					//if(hs.contains(s))
					//{
						//max1=hs.get(s);
					//}
				}
 
			    if(d<=max1)
			    {
    				int sum1=Math.abs(max1-f+1);
	    			int sum2=Math.abs(max1-d+1);
			    	int sum3 =Math.abs(c-e);
			    	Long sum=0L;
			    	sum=sum+sum1+sum2+sum3;
				    System.out.println(sum);
			    }
 
			    else
			    {
    				int sum1=Math.abs(d-f);
			    	int sum2 =Math.abs(c-e);
			    	Long sum=0L;
			    	sum=sum+sum1+sum2;
				    System.out.println(sum);
			    }
			}       
		}
	}
}