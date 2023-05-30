package exception;
class A9
{
void show()
{
    System.out.println("hello");
}
}
public class classnotfound extends A9 {
    public static void main(String[] args) {
        classnotfound a=new classnotfound();
        a.show();
    }
}