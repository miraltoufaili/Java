To improve the efficiency, we tend to add two important fields.  
* Keep track of the length of the list  
* Keep a reference to the back of the list  
  
    
##Adding to a list  
There are **only two ways** to change the contents of a list:  
* Change the value of **front**, i.e changing the starting point  
* Change the value of **variable.next** (current!!), i.e changing one of the current links of the list.  
  
  We have to stop *one position** early, i.e we need to position current to the final element!  

* Always remember to deal with the empty list condition   

    public class LinkedIntList {
	private ListNode front;  // private to make sure that it is encapsulated 
	
	// constructor: constructs an empty list
	
	public LinkedIntList(){
		front = null;
	}
	
	//method to examine the list
	public void print(){
		ListNode current = front;
		while (current !=null){
			System.out.println(current.data);
			current = current.next; 
		}	
	}
	
	//better make it return a string
	
	public String toString(){
		if ( front == null){
			return "[ ]";
		} else {
			String result = "[" + front.next;
			ListNode current = front.next; // we handled the data of the first node outside!!!!
			while(current != null){
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result; 
		}
	}
	
	//adding at the end.
	//You NEED TO STOP ONE STEP EARLY IN PROCESSING THE LIST!!
	
	public void add(int value){
		if (front == null){
			front = new ListNode (value);
		} else {
			ListNode current = front; 
			while(current.next != null){
				current = current.next; 
			}
			current.next = new ListNode(value);
		}
	}
	
	
	
	

}
