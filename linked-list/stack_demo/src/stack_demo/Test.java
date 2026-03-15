package stack_demo;

public class Test 
{
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(30);
		stack.push(48);
		stack.push(33);
       System.out.println(stack.pop());
       System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		System.out.println(stack.peek());	
	}
}
