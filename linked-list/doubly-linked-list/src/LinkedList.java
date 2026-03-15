
public class LinkedList 
{
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	public void add(int element)
	{
		
		Node node=new Node(element);
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		
	}
}
