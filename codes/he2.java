import java.util.*;
class he2
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l,n;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            n=scan.nextInt();
            int A[]=new int[n];
            int x=scan.nextInt();
            for(j=0;j<n;j++)
            {
                A[j]=scan.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        int m=0;
        for (k=0; k<n; k++)
        {
            // If not present, then put it in hashtable and print it
            if (!set.contains(A[k]))
            {
                m++;
            }
        }
            if(m==x)
            {
                System.out.println("Good");
            }
            if(m<x)
            {
                System.out.println("Bad");
            }
            if(m>x)
            {
                System.out.println("Average");
            }
        }
    }
}