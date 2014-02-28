package dcll.hbra.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack{

	Stack<Object>wrappedStack=new Stack<Object>();
	
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return wrappedStack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return wrappedStack.size();
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		wrappedStack.push(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item) wrappedStack.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item) wrappedStack.pop();
	}

}
