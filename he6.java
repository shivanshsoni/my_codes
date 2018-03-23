import java.util.Scanner;
class he6
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            char A[]=str.toCharArray();
            j=str.length();
            l=0;
            int sum=0;
            while(l<j)
            {
                int m=0;
                while(A[l]=='A'||A[l]=='a'||A[l]=='b'||A[l]=='B'||A[l]=='C'||A[l]=='c')
                {
                    m++;
                    l++;
                }
                sum=sum+m*(m+1)/2;
            
            System.out.println(sum);
        }
    }
    }
}