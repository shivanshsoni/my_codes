public B() { this(5); }
{
    private int a;
    protected A(int a)
    {
        this.a = a;
    }
}
public class B extends A
{
    public B(int a)
    {
        super(a);
    }
    public B()
    {
        this.a = 5;//Line1
}