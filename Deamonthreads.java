public class Deamonthreads extends Thread {
public void run()
{
if(Thread.currentThread().isDeamon() {
System.out.println("Deamon thread123");
}
public static void main(String[] args)
{
System.out.println("main methods");
deamonthreads6 ds=new deamonthreads6();
ds.setDeamon(true);
ds.start();
}
}
}