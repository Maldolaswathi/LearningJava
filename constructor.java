class constructor
{
    int i;
    String s;
    constructor(int i1,String s1)
    {
        i=i1;
        s=s1;
    }
    public static void main(String[] args)
    {
         constructor co= new  constructor(100,"yes");
         constructor c1= new  constructor(400,"no");
         System.out.println("value of i:"+co.i);
         System.out.println("value of s:"+co.s);
                 System.out.println("value of i:"+c1.i);
         System.out.println("value of s:"+c1.s);
    }
}
   