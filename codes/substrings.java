import java.util.Scanner;
 import java.math.*;
class substrings
{
   public static void main(String args[])
   {
      String string, sub;
      int i, c, length,l;
 
      Scanner scan=new Scanner(System.in);
      string=scan.next();
      length=string.length();
      l=0;
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
            BigInteger num=new BigInteger(sub);
            if(num.mod(BigInteger.valueOf(8)).equals(0))
            {
               l++;
            }
         }
      }
      System.out.println(l);
   }
}