package abstraction;
class s1{
    
}
abstract class p1
{
    abstract void m1();
    abstract void m2();
}
abstract class q extends package{
    void m1()
    {
        System.out.println("method 1");
    }
}
class r extends q
{
    void m2()
{
      System.out.println("method 2");
}
}
public class abs3 {
    public static void main(String[] args) {
        p P=new r();
        P.m1();
        P.m2();
    }
}