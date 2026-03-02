import java.util.concurrent.ConcurrentHashMap;

public class LinkedList
{
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	//Method to add a node in a linked list
	public boolean add(int element)
	{
		Node newNode=new Node(element);
		if(isEmpty())
		{
			head=newNode;
			System.out.println("Node ("+newNode.data+") has been added as head node;");
			return true;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				
				current=current.next;
			}
			current.next=newNode;
			System.out.println("Node ("+newNode.data+") has been added to the next of node ("+current.data+")");
			return true;
		}
		
		
	}
	//Method to show all elements in a linked list
	public void showElements()
	{
	
			Node current=head;
			while(current.next!=null)
			{
				System.out.print("->"+current.data);
				current=current.next;
			}
		System.out.println();
	}
	//method to check that linked list is empty or not
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	//method to search the element in a linked list 
	public boolean search(int element)
	{
		if(isEmpty())
		{
		return false;
		}
		Node current=head;
		while(current.next!=null)
		{
			if(current.data==element)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	//Method to delete a node in a linked list
	public boolean remove(int element)
	{
		if(isEmpty())
		{
			return false;
		}
		//if deleted node is a first node
		if(element==head.data)
		{
			head=head.next;
			
		}
		//if deleted node not a first node
		Node current=head.next;
		Node previous=head;
		while(current!=null)
		{
			if(element!=current.data)
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
	
}
