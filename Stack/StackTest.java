import com.mingche.Stack;
import com.mingche.FullStackException;
import com.mingche.EmptyStackException;

public class StackTest
{
	public static void main(String[] args)
	{
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
		
		Stack<Integer> intStack = new Stack<Integer>(12);
		//Stack doubleStack = new Stack();
	
		//intStack.pushValue(intArray);
		//intStack.popValue();
		//doubleStack.pushValue(doubleArray);
		//doubleStack.popValue();
                intStack.push(intArray[0]);
                intStack.push(intArray[1]);
                intStack.push(intArray[2]);
                intStack.push(intArray[3]);
                intStack.pop();
                intStack.pop();
	}
}
