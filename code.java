import java.util.Scanner;
import java.util.Arrays;
//import java.lang.*;
class code
{
    public static void main(String[]atsg)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        StringBuilder ptr = new StringBuilder("");
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            ptr=ptr.append(str);
        }
       
        String PTR=ptr.toString();
        char A[]=PTR.toCharArray();
        int res=0;
        k=PTR.length();
        Arrays.sort(A);
        j=0;
        l=0;
        while(l!=k)
        {
            int y=0;
            while(A[j]==A[l]&&l<k)
            {
                y=1;
                l++;
            }
            j=l;
            if(y==1)
            {
                res++;
            }
        }
        System.out.println(res+1);
    }
}