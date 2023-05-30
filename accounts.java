class accounts
{
    String accname;
     String acctype;
     int accbalance;
     String accnumber;
    public accounts(String name,String type,int bal,String num)
     {
        accname=name;
        acctype=type;
        accbalance=bal;
        accnumber=num;
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
        accounts ac=new accounts("ravi","saving",10000,"axa123");
        //acc.setDetails();
        ac.getDetails();
        accounts ac1=new accounts("ram","current",20000,"stfg12");
        ac1.getDetails();
     }
}
    