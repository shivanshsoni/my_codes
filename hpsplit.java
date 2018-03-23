import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;
 
class GfG
{
    // Function returns the minimum number of swaps
    // required to sort the array
    public static int minSwaps(int[] arr)
    {
        int n = arr.length;
 
        // Create two arrays and use as pairs where first
        // array is element and second array
        // is position of first element
        ArrayList <Pair <Integer, Integer> > arrpos =
                  new ArrayList <Pair <Integer, Integer> > ();
        for (int i = 0; i < n; i++)
             arrpos.add(new Pair <Integer, Integer> (arr[i], i));
 
        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair<Integer, Integer>>()
        {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2)
            {
                if (o1.getValue() > o2.getValue())
                    return -1;
 
                // We can change this to make it then look at the
                // words alphabetical order
                else if (o1.getValue().equals(o2.getValue()))
                    return 0;
 
                else
                    return 1;
            }
        });
 
        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
 
        // Initialize result
        int ans = 0;
 
        // Traverse array elements
        for (int i = 0; i < n; i++)
        {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).getValue() == i)
                continue;
 
            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;
 
                // move to next node
                j = arrpos.get(j).getValue();
                cycle_size++;
            }
 
            // Update answer by adding current cycle.
            ans += (cycle_size - 1);
        }
 
        // Return result
        return ans;
    }
}
 
// Driver class
class hpsplit
{
    public static void main(String[] args)
    {

    	Scanner scan=new Scanner(System.in);
    	int t,i,j,k,l,n;
    	t=scan.nextInt();
    	for(i=0;i<t;i++)
    	{
    		int n=scan.nextInt();
        	int A[]=new int[n];
        	for(j=0;j<n;j++)
        	{
        		A[j]=scan.nextInt();
        	}
        	int B[]=new int[n];
        	for(k=1;k<t;k++)
        	{
        		int f=0;
        		for(l=k;l<t;l++)
        		{	
        			B[f]=A[l];
        			f++;
        		}	
        		for(int y=0;y<k;y++)
        		{
        			B[f]=A[y];
        			f++;
        		}
        		GfG g = new GfG();
        		System.out.print(g.minSwaps(B)+" ");
        	}
        }
        System.out.print(g.minSwaps(A));
    }
}