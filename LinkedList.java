
public class LinkedList { 
		  public static void main(String args[]){
		    ListNode list = new ListNode(3, new ListNode (9, new ListNode (11)));  
		    System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		  
		    
		    //Remove the first node
		    list = list.next; // variable list is pointing to the node that is storing 9
		     				  // Java reclaims the space so that it can be used again through automatic garbage collection
		   // if you set list = null then you'll lose the whole list!!
		    
		    //Looping through a List  
		    //Create a new variable, if you use the original one, then you will lose the list!  
		    //Once the new variable == null =>  you exit your loop.
		    
		    ListNode current = list; 
		    while (current != null) {
		    	System.out.println(current.data);
		    	current = current.next; 
		    }
		    //or
		  
		    for(current = list; current != null; current = current.next){
		         System.out.println(current.data);
		    
		    
		    
		  } 
}

		    
