import java.util.Scanner;
class code4
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            k=scan.nextInt();
            l=scan.nextInt();
            String str=Integer.toBinaryString(k);
            String ptr=Integer.toBinaryString(l);
            if(ptr.length()>str.length())
            {
                System.out.println(ptr.length()-str.length());
            }
            else
            {
                System.out.println(str.length()-ptr.length());
            }
        }
    }
}