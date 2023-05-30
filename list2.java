import java.util.Scanner;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int amount=sc.nextInt();
        int rs500,rs100;
        if(amount>15000)
        System.out.println(" u can withdraw only 15000 per transaction");
        else if(amount%100!=0)
        System.out.println(" enter only factors of 100");
        else if(amount>500)


    }
}