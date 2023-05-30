class fridayaccount
{
    String accname;
     String acctype;
     int accbalanace;
     String accnumber;
     public void setDetails()
     {
        accname="ramesh";
        acctype="savings";
        accbalances=50000;
        accnumber="ABCD2345";
     }
     public void getDetails()
     {
        System.out.println("account name is:"+accname);
        System.out.println("account type is:"+acctype);
       System.out.println("account balance is:"+accbalance);
       System.out.println("account number is:"+accnumber);
     }
     public static void main(String[] args) {
        fridayaccount acc=new fridayaccount();
        acc.setDetails();
        acc.getDetails();
     }
}
    