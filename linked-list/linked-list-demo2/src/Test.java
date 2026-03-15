
public class Test {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addElement(10);
		list.addElement(20);
		list.addElement(40);

		list.addElement(50);
		list.addElement(60);
		list.addElement(70);
		list.addElement(80);
		list.add(30, 2);

		list.showElements();
//		list.addElement(50);
//		list.addBegin(93);
		list.showElements();
		list.reverse();
		list.showElements();
		
	}
}
