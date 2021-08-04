package Java_New_Feautures;

import java.util.HashMap;
import java.util.Map;

public class Lamda_map {

	public static void main(String[] args) {
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        books.forEach((key,value)->System.out.println("Book name="+key+"Author="+ value));

	}

}
