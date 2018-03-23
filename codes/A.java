import java.util.*;
class A
{
    int add(int i, int j)////Line 3
    {
        return i+j;
    }
}
public class B extends A
{
    public static void main(String argv[])
    {
        short s = 9;//Line 1
        System.out.println(add(s,6));//Line 2
    }
}