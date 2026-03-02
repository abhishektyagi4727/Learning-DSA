
public class Test {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addElement("abhi");
		list.addElement("jatin");
		list.addElement("ashu");
		list.addElement("viraj");
		list.showElements();
		System.out.println(list.search("viraj"));
		System.out.println(list.search("ashu"));
		list.remove("viraj");
		list.showElements();
		list.remove("ashu");
		list.showElements();

	}
}
