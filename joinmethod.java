public class joinmethod extends Thread {
    public void run()
    {
        try {
        for(int i=1;i<=5;i++)
        {
            System.out.println("child thread"+i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    }
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    
