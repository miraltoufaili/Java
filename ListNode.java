
public class ListNode {
	public int data;  // data stored in this node 
	public ListNode next; // link to the next node 
	
	public ListNode () { 
		this (0, null);
	}
	
	public ListNode (int data){
	this (data, null);
	}
	
	public ListNode ( int data, ListNode next){
		this.data = data; 
		this.next = next; 
	}
} 
	
