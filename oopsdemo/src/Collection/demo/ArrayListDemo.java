package Collection.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	

	public static void main(String[] args) {
		// Genric Array list
		ArrayList<String> s=new ArrayList<String>();
		s.add("ranjan");
		s.add("rahul");
		s.add("ran");
		s.add("ranjan");
		s.add("ranjan");
		System.out.println(s);
		//ELEMENT FROM INDEX
		System.out.println("element at index="+s.get(2));
		System.out.println("list contain element java"+s.contains("Ranjan"));
		//Add in the position
		s.add(3,"naveen");
		System.out.println(s);
		//array list empty or not
		
		System.out.println(s.isEmpty());
		
		Collections.sort(s);
		System.out.println("SORTED ARRAY"+s);

		//a.add(100) it was an integer
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		ArrayList <Integer> a1=new ArrayList<Integer>();
		a1.add(500);
		a1.add(500);
		a1.add(500);
		a1.add(500);
		a1.add(500);
		System.out.println(a1);
		System.out.println("Size"+a1.size());

		
		
	}

}
