package Collection.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating list of string
		/* Collections is an utility class in java.util package. 
		It consists of only static methods which are used to operate on objects 
		of type Collection. 
		 
		 */
				// Create a list of strings
		// Create a list of strings
			 	ArrayList<String> al = new ArrayList<String>(5);
			 	al.add("Java For Developers");
			 	al.add("Friends");
			 	al.add("Dear");
			 	al.add("Is");
			 	al.add("Superb");
			 	
			 	Collections.sort(al);
			 	System.out.println(al);
			 	
			 	
			 	
			 	 ArrayList<String> n=new ArrayList<String>(5);
			     n.add("Java");
			     n.add("Fri");
			     n.add("De");
			     n.add("Ist");
			     n.add("Sup");
				Collections.copy(n, al);
			     System.out.println("The new ArrayList Contents:"+n);
			     n=al;
			     System.out.println("The new ArrayList Contents:"+n);
			     
			     ArrayList<String> n1=new ArrayList<String>(5);
			     n1.addAll(al);
			     System.out.println(n1);
			     
			     ArrayList<String> n2=new ArrayList<String>(5);
			      n2= (ArrayList<String>) al.clone();
			      System.out.println(n2);
			 	

	}

}
