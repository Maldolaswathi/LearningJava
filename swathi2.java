class swathi2
{
   int a=10;//instance//
   static int b=20;//static
   public static void main(String[] args)
   {
       int c=30;//local
//creating object
       swathi2 obj =new swathi2();
       System.out.println(obj.a);
       System.out.println(c);
       System.out.println(b);//or system.out.println(swathi2.b) for static
}
}