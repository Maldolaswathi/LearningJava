class account
{
    String accname;
     String acctype;
     int accbalanace;
     String accnumber;
     public void setDetails()
     {
        accname="ramesh";
        acctype="savings";
        accbalance=50000;
        accnumber="ABCD2345";
     }
     public void getDetails()
     {
        System.out.println("------------------------");
        System.out.println("account name is:"+accname);
        System.out.println("account type is:"+acctype);
       System.out.println("account balance is:"+accbalance);
       System.out.println("account number is:"+accnumber);
     }
     public static void main(String[] args) {
        account acc=new account();
        acc.setDetails();
        acc.getDetails();
     }
}
    