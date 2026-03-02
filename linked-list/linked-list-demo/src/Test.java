
public class Test
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(30);
		list.add(230);
		list.add(44);
		list.add(33);
		list.showElements();
		list.remove(230);
		list.showElements();
		list.remove(20);
		list.showElements();
	System.out.println(	list.search(20));
	}
}
