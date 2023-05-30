class number
{
    public static void main(String[] args)
    {
        int a=20,b=30,c=100;
        if(a>b)
        {
            if(a>c)
            System.out.println(a);
        }
            else if(b>c)
            {
                System.out.println(b);
            }
            else
                if((a==b)&&(a==c))
                {
                System.out.println("all are equal");
            }
            else
            {
            System.out.println(c);
            }
    }
}


