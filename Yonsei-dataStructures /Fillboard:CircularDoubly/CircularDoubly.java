/*
 * *Name: Sydney Baffour 
 * *Student ID: 2018843693
 */

public class CircularDoubly
{
	 private  Node head; 
	 private  Node tail; 
	 private  int size; 
     private  Node newNode;	

public class Node
{
	public int value;
	public Node prev;
	public Node next;
}
 	
	public CircularDoubly() {
		
	
	 head = null;
	 tail = null;
	 size = 0;
	 	
	}
	public void addHead(int value) {

	Node newNode = new Node();
	   newNode.value= value;	
	
	if(head == null){
			head = newNode;
	}
   else{
	   newNode.next = head;
	   newNode.prev = tail;
	   head.prev = newNode;
	   tail.next = newNode;
	   head = newNode;
	   }
   	size++;

	}
	public void addTail(int value) {

	    Node newNode =  new Node();
		newNode.value = value;

		if(tail == null){
			tail = newNode;
		}
		else{		
	   newNode.next = head;
	   newNode.prev = tail;
	   tail.next = newNode;
	   head.prev = newNode;
			tail = newNode;	 
		}
		
		size++;
	}
	
	public Node getHead() {
		
		 if (head == null){
			 return null;
		 }
		 else{
			 return head;
		 }
		
	}
	
	public Node getTail() {
		 if (tail==null){
			return null;
		 }
		 else{
			 tail = head.prev;
			 return tail;
		 }
	}
	
	public void deleteHead() throws EmptyListException {
		
		head.next.prev = tail; 
		tail.prev = head.next;
		size--;
	}
	public void deleteTail() throws EmptyListException {
		head.prev = tail.prev; 
		tail.prev.next = head;
		size--;
	}
	
	public int size() {
		 int counter = 0; 
		 if (head == null&& tail == null || head == tail){
			 return 0;
		 }
		 else {
		   Node current = head; 
		   counter = 1; 
		   while(current!= tail){
			   counter ++;
			   current = current.next;
		   }
		   return counter;
		 }	
	}
	
	public boolean empty() {
		if (head == null){
			return true;
		}
		else {
			return false;	
		}
		
	}
	
	public void clear() {
		Node current = head; 
		while (current!= null){
			current = null;
			current = current.next;
		}
	}
	
	public boolean find(int value) {
		 if(head == null){
			 return false;
		 }
		 else if (head.value == value){return true;
		 }
		 else if (tail.value == value){return true;
		 }
		else{
			Node current = head; 
			while (current!= tail){
				if(current.value == value){
					return true;
				}
				else{
					current=current.next;
				}
			}
			return false;
		}	
	}
	
	public void rotateForward() {
		if( head == null){
			head = tail;
		}
		else if( head == tail){
			head=tail;}
		else if (head.next ==tail){head=head;}
		else { 
		head = head.next;
		tail = tail.next; 
		}
	}
	
	public void rotateBackward() {
		if( head == null){
			head=tail;}
		else if (head.next ==tail){head=head;}
		else { 
		tail = tail.prev;
		head = head.prev;
		}	
	}
}