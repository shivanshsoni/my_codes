import java.util.Scanner;
class queue1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int A[]=new int[t];
        k=0;
        l=0;
        for(i=0;i<t;i++)
        {
            String ch=scan.next();
            if(ch.equals("E"))
            {
                j=scan.nextInt();
                A[k]=j;
                k++;
                System.out.println(k-l);
            }
            else
            {
             //   l++;
                if(k-l==0)
                {
                    System.out.println("-1"+" "+"0");
                }
                else
                {
                    l++;
                    System.out.print(A[l-1]+" "+(k-l));
                    System.out.println("");
                }
            }
            if(l>k)
            {
                l=k;
            }
        }
    }
}