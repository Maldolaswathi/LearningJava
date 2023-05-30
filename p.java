class p
{
    void yes()
    {
        System.out.println("morning");
    }
    class q extends p
    {
        void yes()
        {
          System.out.println("noon");  
        }
        class tester
        {
            public static void main(String[] args)
            p P =new q();
            P.yes();
        }
    }
}

 