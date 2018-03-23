import java.util.Scanner;
import java.util.*;
class array2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Long A[]=new Long[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextLong();
		}
		HashMap<Long, Long> h=new HashMap<Long, Long>();
		for(j=0;j<t;j++)
		{
			if(h.containsKey(A[j]))
			{
				h.put(A[j],h.get(A[j])+1L);
			}
			else
			{
				h.put(A[j],1L);
			}
		}

		k=scan.nextInt();
		for(l=0;l<k;l++)
		{
			Long a=scan.nextLong();
			int b=scan.nextInt();
			if(a==0)
			{
				Iterator it=h.entrySet().iterator();
				int p=0;
				int fg=0;
				while(it.hasNext())
				{
					Object firstkey=h.valueSet().toArray()[fg];
					Object val=h.get(firstkey);
					Long o=((Long) val).longValue();
					if(o>=b)
					{
						p=1;
						Long f=((Long) h.get(h.keySet().toArray[fg])).longValue();
						System.out.println(f);
						break;
					}
					fg++;
				}
				if(p==0)
				{
					System.out.println("0");
				}
			}
			if(a==1)
			{
				Iterator it=h.entrySet().iterator();
				int p=0;
				while(it.hasNext())
				{
					Map.Entry pair=(Map.Entry)it.next();
					Long o=((Long) pair.getValue()).longValue();
					if(o==b)
					{
						p=1;
						Long f=((Long) pair.getKey()).longValue();
						System.out.println(f);
						break;
					}
				}
				if(p==0)
				{
					System.out.println("0");
				}
			}
		}
	}
}