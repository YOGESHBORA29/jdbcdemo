package Collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListirationdemo {

	public static void main(String[] args) {
		ArrayList<String> name =new ArrayList<String>();
		name.add("rahul");
		name.add("rahul");
		name.add("rahul");
		name.add("rahul");
		System.out.println(name);
		//Iterator Interface for trVERCING
		Iterator<String> itr =name.iterator();
		//iterator for treversing
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		name.set(2,"mmm");
		
		
		

	}

}
