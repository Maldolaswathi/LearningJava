package abstraction;
//can abstract cls extends concrete class--?yes
abstract class x{
    void m1(){
        System.out.println("m1 method");
    }
    abstract void m2();
    abstract void m3();
    }
    class y extends x
    {
        void m2()
        {
            System.out.println("m2 method");
        }
        void m3()
        {
            System.out.println("m3 method");
        }
    }
    class absintro {
        public static void main(String[] args) {
            x X=new y();//abstract class ref sub object
            X.m1();
             X.m2();
              X.m3();
              System.out.println("-----------------");
              y Y=new y();//subclasss ref subclass obj
              Y.m1();
             Y.m2();
             Y.m3();
        }
    }
    
   
