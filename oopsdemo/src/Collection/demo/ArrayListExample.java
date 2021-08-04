package Collection.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Book> b=new ArrayList<Book>();
		//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        //add book to list
        b.add(b1);
        b.add(b2);
        b.add(b3);
        System.out.println("******************************book Details***************************************************888");
        for(Book i:b)
        {
        	System.out.println("id="+i.id+""+i.author+""+i.publisher);
        }
		

	}

}
