package Collection.demo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <String> s= new Stack<String>();
		s.push("rahul");
		s.push("rahul");
		s.push("rahul");
		s.push("rahul");
		s.push("rahul");
		System.out.println("Remove element"+s.pop());
		
		
		
Iterator<String> itr=s.iterator();
while (itr.hasNext())
	{
	System.out.println(itr.next());
	}
	System.out.println("Element on top"+s.peek());
	}
	

}
