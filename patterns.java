class patterns
{
    void rectangle()
    {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void rightang()
    {
        int a=1;
        while(a<=10)
        {
            int b=1;
            while(b<=a)
            {
                System.out.print("*");
                b=b+1;
            }
            System.out.println();
            a=a+1;
        }
    }
    static void inverse()
    {
        int a=1;
        do{
            int b=1;
            do{
                System.out.print("*");
                b=b+1;
            }while(b<=11-a);
            System.out.println();
            a=a+1;
        }while(a<=10);
    }
    static void spaces()
    {
        
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=10-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        patterns obj=new patterns();
        obj.spaces();
        obj.rectangle();
        obj.rightang();
        inverse();
    }
}

    

      