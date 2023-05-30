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
        Interface2 I=new Interface2();
        I.m1();
         I.m2();
          I.m3();
          System.out.println("-----------------");
          I1 z=new Interface2();
          z.m1();
          z.m2();
          z.m3();
          System.out.println("-----------------");
          System.out.println(I1.a);
          System.out.println(z.a);
          System.out.println(Interface.a);
          System.out.println(I1.a);
    }
}



  
