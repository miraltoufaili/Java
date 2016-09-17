##Arrays 
  * Stores in one large cantiguous block of memory 
  * Random Access: ability to quickly jump around in the array 
  
**Weakness** 

     Can't easily insert values in or remove from the middle without shifting other values
     Can't easily enlarge the size of the structure without constructing a new larger array


##Linked List Structure
  * Not a random access structure (not easy to jump)
  * Sequential access 

    
**Strength** 

     Can quickly insert values in or remove from the middle without any shifting other values
     Can easily make it larger or smaller

##Node 
  A single element that contais ONE data value  
  It is an object made of two fields: One to Storge a single item of data and one for storing the reference to the next node   

### CODE 
  Declaration of the node class:   
  
  public class ListNode {  
  public int data;  
  public ListNode next;  



