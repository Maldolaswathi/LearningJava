public class join123 extends Thread {
    static Thread mainthread;
    public void run()
    {
        try {
            mainthread.join();
            for(int i=1;i<=5;i++)
            {
                System.out.println("child thread"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        mainthread=Thread.currentThread();  
        join123 jo=new join123();
        jo.start();
        try {
            for(int i=1;i<=5;i++)
            {
                System.out.println("main method"+i);
                Thread.sleep(1000);
            }
        }
 catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}