/*
* Name: 
* Student ID: 
*/

import java.lang.Comparable;
/* DO NOT IMPORT ANYTHING */

/*
* We will not answer questions about Comparable interface.
* Please refer to the official API document.
* https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
*/

public class Heap<K extends Comparable<K>, V> { 
		
public Node<K, V> root;
private Node<K, V> lastNode;
private Node<K, V> insertNode;

private int size;
	
public Heap(){		
	   root=lastNode = new Node<K, V>(null, null, null, null, null);
       size = 0;
   
	}

public void push(K key, V value)
	{
		Node newest = new Node(key,value,null,null,null);

		if(size == 0){
            root.key = key;
			root.value = value;
			root.left = insertNode;
			newest.parent = root;
			size++;
		}		
        else {
			newest.key = key;
			newest.value = value;
			upHeap(insertNode);
			size++;
		}
		increaseLast();
	}
private void swapNodes(Node n1, Node n2){

		V vt = (V)n1.value;
		K kt = (K)n1.key;
		n1.key = n2.key;
		n1.value = n2.value;
		n2.key = kt;
		n2.value = vt;
	}
public void upHeap (Node n){
		if(n.parent == null || n.key.compareTo(n.parent.key) > 0){
			return;
		}
		else{
			swapNodes(n, n.parent);
			upHeap(n.parent);
		}
	  }

public void downHeap(Node n){
	if(n.left==null && n.right == null){
			  return;
		  }
		  else if (n.left!=null && n.right==null){
			  if (n.key.compareTo(n.left.key)>0){
				  swapNodes(n,n.left);
			  }
		  }
		  else {
			  if (n.left.key.compareTo(n.right.key)<=0){
				  swapNodes(n,n.left);
			  }
			  else{
				  swapNodes(n,n.right);
			  }
		  }  
	  }

public void increaseLast(){
		if(lastNode == null){
			lastNode = root;
		}
		else if (lastNode.right == null){
			return;
		}
		else {
	    Node current = lastNode;
        while(current.parent!=null && current.parent.right == current){
			current = current.parent;
		}
        if(current.parent != null){
			current = current.parent.right;
		}
        while(current.left != null){
			current = current.left;
		}
        
		lastNode = current;
		  }
}
public void decreaseLast(){
        if(lastNode.left != null || lastNode.right != null)return; 
        Node p = lastNode;
        while(p.parent!=null && p.parent.left == p)p = p.parent;
        if(p.parent != null)p = p.parent.left;
        while(p.right != null)p = p.right;
        lastNode = p.parent;
    }
	
	
public V pop() throws EmptyException{
	if(size==0){throw new EmptyException();}
	else if(size == 1){
		V result = root.value;
		root = null;
		lastNode = null; 
		size--;
		return result;}
	else{
		V result = root.value;
	decreaseLast();
	Node<K,V> N;
	if(lastNode.right!= null){
		N = lastNode.right;
		lastNode.right = null;
	}
	else {
		N = lastNode.left;
		lastNode.left = null;
	}
	root.key = N.key; 
	root.value = N.value;
	size--;
	downHeap(root);
	return result;}
}
/*
		* Output: The value of the smallest key
		* Remove the value from the heap.
		* If this heap is empty, *throw an EmptyException*.
		*/
public V peek() throws EmptyException{
 if(isEmpty())throw new EmptyException();
 else{
	return root.value;
 }	
}		
public void remove(V value){
/*
      
        Node<K,V> n = root;
        Node parent = null;
        while (value!= n.value)
        {
            parent = n;
            if (n.key.compareTo(value) >= 1)
                n = n.right;
            else
                n = n.left;                
        }
		
		swapNodes(n,lastNode);
		swapNodes(lastNode,root);
		Node <K,V> prevLastNode=lastNode;
		decreaseLast();
		prevLastNode=null;
		downHeap(root);
		

        
	
	*/
}		
	
public void clear(){
		;
	}
	
public int size(){
			return size;

	}
	
	public boolean isEmpty()
	{
		if(root==null)return(true);
        else return(false);
	}

}
	
	/* Feel free to add additional methods. We will not test them. */
