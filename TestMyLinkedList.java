public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		//Create two seperate LinkedLists
		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
		//Add elements to LinkedList1
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		list1.append(5);
		//Reverse LinkedList1
		list2 = list1.reverse(list1);
		//Output the elements in list1 by implicitly calling the toString method
		System.out.println("\n********************************\nList1:\t"+list1);
		//Output the elements in list2 by implicitly calling the toString method
		System.out.println("\n********************************\nList2:\t"+list2);
		//Create two seperate LinkedLists
		MyLinkedList<Character> listA = new MyLinkedList<Character>();
		MyLinkedList<Character> listB = new MyLinkedList<Character>();
		//Add elements to LinkedList1
		listA.append('r');
		listA.append('a');
		listA.append('c');
		listA.append('e');
		listA.append('c');
		listA.append('a');
		listA.append('r');
		//Reverse LinkedListA
		listB = listA.reverse(listA);
		//Output the elements in list1 by implicitly calling the toString method
		System.out.println("\n********************************\nListA:\t"+listA);
		//Output the elements in list2 by implicitly calling the toString method
		System.out.println("\n********************************\nListB:\t"+listB);
	}
}
