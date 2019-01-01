/*
* Name: 
* Student ID: 
*/

import java.lang.Comparable;
/* DO NOT IMPORT ANYTHING */

public class PrioritySort<V>
{
	/* You may use Heap class. */
	
	public PrioritySort()
	{
		;
	}
	
	public void push(V value, int priority)
	{
		/*
		* Input: a value and its priority
		* Push the value with given priority.
		*/
		;
	}
	
	public V pop() throws EmptyException
	{
		/*
		* Output: The value with the lowest/highest priority
		* Remove the value.
		* Note that the order or priority may change.
		* If there are no items, *throw an EmptyException*.
		*/
		return null;
	}
	
	public V peek() throws EmptyException
	{
		/*
		* Output: The value with the lowest/highest priority
		* Do not remove the value.
		* Note that the order or priority may change.
		* If there are no items, *throw an EmptyException*.
		*/
		return null;
	}
	
	public void clear()
	{
		/*
		* Clear all data.
		*/
		;
	}
	
	public int size()
	{
		/*
		* Output: Count the number of items.
		*/
		return 0;
	}
	
	public boolean isEmpty()
	{
		/*
		* Output: true if it there are 1+ items, false otherwise.
		*/
		return false;
	}
	
	public void smallestFirst()
	{
		/*
		* Set the lowest priority first.
		*/
		;
	}
	
	public void largestFirst()
	{
		/*
		* Set the highest priority first.
		*/
		;
	}
}