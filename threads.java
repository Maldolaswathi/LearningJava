//package Threads;
	class thread1 extends Thread
    {
        public void run() 
        {
            System.out.println("Thread task");  
              }    
        public static void main(String[] args)
        {
            thread1 T=new thread1();
            T.start();
            /*thread1 Th */
        }
    }

    
    
       
