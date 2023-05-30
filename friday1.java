class friday1
{
    int i;
    int j;
     friday1()
    {
        int i=10;
        int j=20;
    }
    public int add()
    {
        int result=i+j;
        return result;
    }
    public int sub()
    {
        int result=i-j;
        return result;
    }
    public int mul()
    {
        int result=i*j;
        return result;
    }
    public static void main(String[] args)
    {
        friday1 fr=new friday1();
        System.out.println("addition is"+fr.add());
          System.out.println("subtraction is"+fr.sub());
            System.out.println("multiplication is"+fr.mul());
        //fr.add();
        //fr.sub();
        //fr.mul();
    }
}

