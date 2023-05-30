package Exception;
class trycatchfinally 
{
    public static void main(String[] args) {
try
{
    System.out.println("inside try before exception!!");
    int i=10;
    int j=2;
    System.out.println("inside try after exception!!");
}
catch(ArithmeticException e)
{
    System.out.println(e);
    System.out.println(e.getStackTrace());
    System.out.println(e.getMessage());
     System.out.println("inside  catch");
}
finally
{
     System.out.println("inside finally");
}
    }
}







