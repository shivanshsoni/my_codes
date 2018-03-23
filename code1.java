import java.util.Scanner;
 
class code1
{
   public static void main(String args[])
   {
      String string, sub;
      int i, c, a,length,k,b,m;
      Scanner scan = new Scanner(System.in);
      string  = scan.nextLine();
       k=scan.nextInt();
       b=scan.nextInt();
       m=scan.nextInt();
       length = string.length();
       int A[]=new int[length-k+1];
       int l=0;   
      for( c = 0 ; c < length ; c++ )
      {
         sub = string.substring(c,k+c);
         int y=sub.length();
         int g=Integer.parseInt(sub);
         a=0;
         for(int u=0;u<y;u++)
         {
          b=g%10;
          a=a+(Math.pow(2,u))*b;
         }
         A[l]=a;
         l++;
      }

   }
}