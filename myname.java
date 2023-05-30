import java.util.Scanner;
class myname
{
    public static void main(String[] args)
    {
        char a;
        System.out.println("enter your name");
        Scanner obj=new Scanner(System.in);
        a=obj.next().charAt(0);
        switch(a)
        {
            case 's':System.out.println("sensitive");
            break;
            case 'w':System.out.println("wonder");
            break;
            case 'a':System.out.println("adaptable");
            break;
            case 't':System.out.println("true");
            break;
            case 'h':System.out.println("humorous");
            break;
            case 'i':System.out.println("irreplacable");
            break;
            default:System.out.println("none of the above");
            break;
        }
    }
}

