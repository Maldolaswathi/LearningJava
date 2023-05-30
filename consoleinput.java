//taking input from Console
import java.io.Console;
class consoleinput { 
public static void main(String[] args) {
String str;
char ch[];
Console obj=System.console();
System.out.println("enter username");
str=obj.readLine();
System.out.println("enter password");
ch=obj.readPassword();
//to display the password
//String a=String.valueOf(ch);
System.out.println("username:"+str);
System.out.println("password:"+ch); 
//System.out.println("password:"+a);
}
}


//remove // to see the entered password 