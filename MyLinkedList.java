public class MyLinkedList<E>
{
	private Node<E> head, tail;
	//Default constructor which creates an empty linkedlist
	public MyLinkedList()
	{
		head = null;
		tail = null;
	}
	//Method for adding an element to the  back of an existing linkedlist
	public void append(E item)
	{
		Node<E> newNode = new Node<>(item);

		if(head == null)
		{
			head = tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	//Method for adding an element to the  front of an existing linkedlist
	public void prepend(E item)
	{
		Node<E> newNode = new Node<>(item);
		newNode.next = head;
		head = newNode;
		if(tail == null)
		{
			tail = head;
		}
	}
	//Method for configuring the on screen output
	public String toString()
	{
		String result = "[";

		Node<E> ptr = head;
		for(ptr = head; ptr != null; ptr = ptr.next)
		{
			result = result + ptr.element.toString();
			if(ptr.next != null)
				result = result + ",";
		}
		result += "]";
		return result;
	}
	//Method used to check if a value already exists in a list or not
	public boolean isMember(E item)
	{
		Node<E> pntr = head;
		while(pntr != null &&((Comparable)pntr.element).compareTo(item) != 0)
		{
			pntr = pntr.next;
		}
		if(pntr == null)
			return false;
		else
			return true;
	}
	/*Method used to check if certain elements of a given list exists in an existing list. If they do not exist they are
	  stored in a different list which is the provided as output.*/
	public MyLinkedList<E> reverse(MyLinkedList<E> item)
	{
		MyLinkedList<E> tmpList = new MyLinkedList<E>();
		Node<E> paramList = item.head;
		while(paramList != null)
		{
			tmpList.prepend(paramList.element);
			paramList = paramList.next;
		}
		return tmpList;
	}
	//The inner class of the LinkedList class
	private static class Node<E>
	{
		E element;
		Node<E> next;

		public Node(E element)
		{
			this.element = element;
			next = null;
		}
	}
}
