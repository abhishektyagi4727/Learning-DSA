package stack_demo;

public class Stack 
{
	private int top;
	private int[] stack;
	private static final int DEFALT_CAPACITY=5; 
	public Stack(int capacity)
	{
		top=-1;
		stack=new int[capacity];
	}
	public Stack()
	{
		this(DEFALT_CAPACITY);
	}
	public int size()
	{
		return top+1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return (top==stack.length-1);
	}
	public int peek()
	{
		if(isEmpty())
			throw new RuntimeException("stack is underflow");
		 return stack[top];
		 
	}
	public void push(int element)
	{
		if(isFull())
		{
			throw new StackFullException("stack is overflow");
		}
		stack[++top]=element;
	}
	public int pop()
	{
		if(isEmpty())
			throw new StackEmptyException("stack is Empty");
		 return stack[top--];
		 
	}
}
