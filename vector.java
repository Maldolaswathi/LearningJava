import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("swathi");
        v.add(0,"swa");
        System.out.println(v);
        Vector v1=new Vector();
       // v1.add("sarala");
        v1.add("swathi");
        v.addAll(0,v1);
        System.out.println(v);
       
    }
}