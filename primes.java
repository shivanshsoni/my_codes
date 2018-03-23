import java.util.Scanner;
public class primes
{   
    public static String answer(int n) 
    { 
       StringBuilder str=new StringBuilder("");
        int p=0;
        int l=2;
        while(p<n+5)
        {
            int m=0;
            for(int j=2;j*j<=l;j++)
            {
                if(l%j==0)
                {
                    m=1;
                    break;
                }
            }
            if(m==0)
            {
                String mtr=Integer.toString(l);
                str=str.append(mtr);
                String htr=str.toString();
                p=htr.length();
            }
            l++;
        }
        String ptr=str.toString(); 
        return ptr;
    } 
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int n,i,j,k,l;
        n=scan.nextInt();
        String ptr=answer(n);
        char A[]=ptr.toCharArray();
        for(k=n;k<n+5;k++)
        {
            System.out.print(A[k]);
        }
    }
}