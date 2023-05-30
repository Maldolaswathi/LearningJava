class threads extends Thread {
public void run()
{
System.out.println(Thread.currentThread().isAlive());
System.out.println("hi is excuted by"+Thread.currentThread.getName());
}
}
public class Threadnamechanges
{
public static void main(String[] args)
{
System.out.println(Thread.currentThread().isAlive());
threads t1=new threads();
t1.setName("swathi");
t1.start();
t1.isAlive();
threads t2=new threads();
t2.setName("swapna");
t2.start();
t2.isAlive();
System.out.println("hello"+Thread.currentThread().getName());
}
}

