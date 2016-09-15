import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class List1 {

    public static void main(String[] args) {

        // List Example implement with ArrayList
        List <String> ls=new ArrayList<String>();
        int i = 0;

        ls.add("one");      // at slot 0 --> one
        ls.add("Three");    // at slot 1 --> Three
        ls.add("two");      // at slot 2 --> two
        ls.add("four");		// at slot 3 --> four
        
        Iterator it=ls.iterator();
        System.out.println("Original ArrayList");
        while(it.hasNext())
        {
          String slot=(String)it.next();
          System.out.println("Slot " + i + " : "+ slot);
          i++;
        } 
        System.out.println ();
        
        
// using set
      ls.set (0,"GREEN"); // slot 0 is now GREEN
      Iterator is=ls.iterator();
      i = 0;
      System.out.println("Case of setting 0 to Green");
      while(is.hasNext())
      {
        String slot=(String)is.next();
        System.out.println("Slot " + i + " : "+ slot);
        i++;
      }
      System.out.println ();
        
        ls.add(1, "RED");   // slot 1 is now RED 
        					// slot 2 is now Three (which was at 1)
        					// slot 3 is now two (which was at 2)
        					// slot 4 is now four (which was at 3)
        
        Iterator s=ls.iterator();
         i = 0;
         System.out.println("Case of adding Red at 1");
        while(s.hasNext())
        {
          String slot=(String)s.next();
          System.out.println("Slot " + i + " : "+ slot);
          i++;
        }
        System.out.println ();
        
  // using remove
        ls.remove(1);       // removed object at slot 2 i.e RED
        
        Iterator t=ls.iterator();
        i = 0;
        System.out.println("Case of removing 1");
        while(t.hasNext())
        {
          String slot=(String)t.next();
          System.out.println("Slot " + i + " : "+ slot);
          i++;
        }
        System.out.println ();
        
        
        
        ls.remove("four");  // removed the object four in all of the slots (if there)          
       
        Iterator n=ls.iterator();
        i = 0;
        System.out.println("Case of removong four");
        while(n.hasNext())
        { 
          String slot=(String)n.next();
          System.out.println("Slot " + i + " : "+ slot);
          i++;
        }
        System.out.println ();
        
 // get    
        System.out.println(ls.get(0)); // getting the object at slot 0
        
    }
}
   

