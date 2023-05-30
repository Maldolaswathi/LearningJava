package abstraction;
abstract class B11
{
    void m1()
    {
        System.out.println("m1 from a1");
    }
    void m2()
    {
        System.out.println("m2 from a1");
    }}
    public class Abs2 extends B11
    {
        public static void main(String[] args) {
            B11 ba=new Abs2();
            ba.m1();
            ba.m2();
        }
    }
