
public class LinkedList
{
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	//Method to add a node
	public void addElement(int element)
	{
		Node newNode=new Node(element);
		if(isEmpty())
		{
			head=newNode;
			System.out.println("Head Nodeis added with data ("+element+")");
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
			System.out.println("Node is added with data ("+element+")");
		}
	}
	//Method to check linked list is empty or not
	public boolean isEmpty()
	{
		return head==null;
	}
	//Method to show all elements of a linked list
	public void showElements()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print("->"+current.data);
			current=current.next;
		}
		System.out.println();
	}
	//method to search element in a linked list
	public boolean search(int element)
	{
		Node current=head;
		while(current!=null)
		{
			if(element==current.data)
			{
				return true;
			}
			current=current.next;
		}
		return false;
		
	}
	//Method to delete element in linked list
	public boolean remove(int element)
	{
		if(head.data==element)
		{
			head=head.next;
		}
		Node current=head.next;
		Node previous=current;
		while(current!=null)
		{
			if(current.data!=element)
			{
				previous=current;
				current=current.next;
			}
			else
			{
				previous.next=current.next;
				return true;
			}
		}
		return false;
	}
	//Method to add element at begnninng
	public void addBegin(int element) 
	{
		Node node=new Node(element);
		node.next=head;
		head=node;
	}
	//method to add at Last
	public void addLast(int element) {
		Node node = new Node(element);
		Node current=head;
		if (head == null) {
	        head = node;
	        return;
	    }

		while(current.next!=null) {
			current=current.next;
		}
		current.next=node;
		
	}
	//method to add at a particular index
	public void add(int element,int position) {
		Node node=new Node(element);
		Node current=head;
		
		for(int i = 0; i < position - 1; i++)		{
			current=current.next;
		}

	    node.next = current.next;
	    current.next = node;
	}
	//method to reverse a linkedlist
	public void reverse() {

	    Node previous = null;
	    Node current = head;
	    Node next = null;

	    while(current != null) {

	        next = current.next;     
	        current.next = previous; 
	        previous = current;      
	        current = next;          
	    }

	    head = previous;
	}
}
