
public class LinkedList {
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	public void add(int element)
	{
		Node node=new Node(element);
		if(isEmpty())
		{
			head=node;
		}
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}

}
