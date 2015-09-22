package com.mingche;

class myStack<E>
{
	private final int size;
	private int top;
	protected E[] elements;
	
	public myStack()
        {
		this(10);
	}
	
	public myStack(int s)
	{
		size = s > 0 ? s : 10;
		top = -1;
		elements = (E[]) new Object[size];
	}
	
	//push
	protected void push(E pushValue)
	{
		if (top == size - 1)
			throw new FullStackException(String.format("Stack is full, can not push %s", pushValue));
		else
			elements[++top] = pushValue;
	}
	
	//pop
	protected E pop()
	{
		if (top == -1)
			throw new EmptyStackException("Stack is empty");
		else
		{
		    E e = elements[top];
		    elements[top--] = null;
		    return e;
		}
	}
}
	
public class Stack<T>
{
	private myStack objStack;
        //static int c = 0;
	
	public Stack()
	{
	    this(10);
	}
	
        public Stack( int s )
        {
            objStack = new myStack<Object>(s);
        }

        public <T> void showStack()
        {
            int i = 0;
            
            System.out.print("Stack: ");
            while (objStack.elements[i] != null)
            {
                System.out.printf("%s ", objStack.elements[i++]);
            }
            System.out.println("\n");
        }

        public <T> void push(T element)
        {
            //pushHelper(objStack, element);
            objStack.push(element);
            System.out.printf("\npush %s into stack. After pushing, the stack is\n", element);
            showStack();
        }

        //private <T> void pushHelper(myStack<T> stack, T element)
        //{
        //    stack.push(element);
        //    System.out.printf("\nStack content: %s\n", stack.elements[c++]);
        //}


        public <T> void pushValue(T[] ArrayElement)
	{
		pushValueHelper((myStack<T>) objStack, ArrayElement);
	}
	
	private <T> void pushValueHelper(myStack<T> stack, T[] ArrayElement)
	{
		try
		{
			System.out.println("\nPushing elements onto stack");
			for(T element: ArrayElement)
			{
				System.out.printf("%s ", element);
				stack.push(element);
			}
		}
		catch( FullStackException fullStackException )
		{
			System.err.println();
			fullStackException.printStackTrace();
		}
	}
	
        public <T> void pop()
        {
            //popHelper((myStack<T>) objStack);
            System.out.printf("\npop %s, ", objStack.pop());
            System.out.println("After popping, stack is: ");
            showStack();
        }

        private <T> void popHelper(myStack<T> stack)
        {
            T popValue;

            popValue = stack.pop();
            System.out.printf("%s ", popValue);
        }

	public <T> void popValue()
	{
		popValueHelper((myStack<T>) objStack);
	}
	
	private <T> void popValueHelper(myStack<T> stack)
	{
		try
		{
			System.out.println("\nPopping elements fron stack");
			T popValue;
			
			while(true)
			{
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		}
		catch( EmptyStackException emptyStackException )
		{
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}

}
