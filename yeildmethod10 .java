public class yeildmethod10 extends Thread {
    public void run() 
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread());
        }
    }
    public static void main(String[] args) {
        yeildmethod10 y=new yeildmethod10();
        y.start();
        Thread.yeild();
        for(int i=0;i<=5;i++)

{
    System.out.println("main thread"+i);
}
    }
}
