package q08;

import java.util.ArrayList;

public class Quiz03_MyStack extends ArrayList {
	private ArrayList<Object> list;

	// Constructor
	public Quiz03_MyStack() {
		list = new ArrayList<Object>();
	}

	// Add a new element to the top of this stack
	public void push(Object o) {
		list.add(o);
	}

	// Return the top element in this stack without removing it
	public Object peek() {
		return list.get(list.size()-1);
	}

	// Return an remove the top element in this stack
	public Object pop() {
		Object obj = list.get(list.size()-1);
		list.remove(list.size()-1);
		
		return obj;
	}

	
	public ArrayList<Object> getList() {
		return list;
	}

	public void setList(ArrayList<Object> list) {
		this.list = list;
	}

	// Return a string of all elements in MyStack
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}