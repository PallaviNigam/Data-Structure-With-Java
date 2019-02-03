import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      ArrayList<String> arrlist = new ArrayList<String>();
      arrlist.add("Hii");
      arrlist.add("How");
      arrlist.add("Are");
      arrlist.add("you");
      Iterator itr= arrlist.iterator();   
      while(itr.hasNext())
      {
          System.out.println(itr.next());
      }
}
}
