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

##### CODE 
  Declaration of the node class:     
  
  public class ListNode {  
  public int data;  
  public ListNode next;  
  
_Linked lists are usually solved by using recursive methods_  

##### Constructing a list  
We begining by creating a reference to the front of the list so we can get to anything in the list.  
  
**ListNode list;**  
  
This variable (list) is not by itself a node!! This is only a variable that is capable of referring to a node. ie it reference to an object. THIS IS NOT A NODE!  
  
To get an actual node, we need to call _new_  
  
**list = new ListNode()**; // this tells Java to construct a new node and have the varable list refer to it   
  
 * Recall that when Java constructs a new object it sets everything to zero ==> we'll have the *data field* in the node has a  *0* value and the *next field* has the value *null*.   
  
  








