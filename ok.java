packages interface;
interface I1
{
    int a=100;//static final and public
    void m1();//abstract varaible
    void m2();
     void m3();
}
public static Interface2 implements I1 {
    public void m1()
    {
        System.out.println("in m1 method");
    }
    public void m2()
    {
        System.out.println("in m1 method");
    }
    public void m3()
    {
        System.out.println("in m1 method");
    }
    public static void main(String[] args) {
        I1 I=new I1();
        I.m1();
         I.m2();
          I.m3();
    }
}

