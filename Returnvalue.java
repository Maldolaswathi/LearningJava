package exception;
class returns
{
    int m1()
{
    try
    {
        return 10;
    }
    catch(Exception e)
    {
        return 20;
    }
    finally 
    {
        return 30;
    }}}
  public class Returnvalue{
    public static void main(String[] args) {
        returns obj=new returns();
        int j=obj.m1();
        System.out.println(j);
    }
  }
  
  
 