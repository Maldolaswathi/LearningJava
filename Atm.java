import java.util.Scanner;
class Atm
{
   void  oper()
   {
      System.out.println("enter pin: ");
      Scanner sc = new Scanner(System.in);
       int pin = sc.nextInt();
       if(pin == 1234)
      {
          System.out.println("========MENU========");
          System.out.println("1.Balance enquieries");
          System.out.println("2.Withdrawing of Money");
          System.out.println("3.Deposits");
          System.out.println("4.Transferring");
      }
    }
     void oper1()
     {
         int bal=500000,with_draw,dep,trans;
         System.out.println("The total balance money in your account are : "+bal);
         Scanner s = new Scanner(System.in);
         int sel = s.nextInt();
         switch(sel)
         {
              case 1: System.out.println("enter the amount to withdraw : "); 
              with_draw=s.nextInt();
               if(bal >= with_draw)
               {
                   bal = bal-with_draw;
                   System.out.println("collect the money");         
               }
             else
              {
                  System.out.println("Insufficient amount");        
              }
                      break;         
               case 2: System.out.println("enter the amount to deposit : "); 
              dep=s.nextInt();
               if(dep >= 500)
               {
                   bal = bal+dep;
                   System.out.println("total amount in the account : "+bal);         
               }
             else
              {
                  System.out.println("Unable to deposit");        
              }
                      break;         
              case 3: System.out.println("Total amount of the account : "+bal); 
                      break;    
          }
     }
     public static void main(String args[])
      {
            Atm a = new Atm();
               a.oper();
               a.oper1();
       }
}
