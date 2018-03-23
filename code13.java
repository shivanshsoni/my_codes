import java.util.Scanner;
class code13
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        String str=scan.next();
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            char A[]=str.toCharArray();
            Long a=scan.nextLong();
            Long b=scan.nextLong();
            k=str.length();
            if(a>k)
            int c =(int) (a%k);
            int d = (int) (b%k);
            //System.out.println(c+" "+d);
            if(c==0)
            {
                c=1;
            }
            if(d==0)
            {
                d=1;
            }
            if(A[c-1]==A[d-1])
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}