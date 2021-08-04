package Java_New_Feautures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//using Lambda expresssion to iterate a Collections
public class LambdaInCollections {
	public static void main(String[] args) 
	{
		List<String> features=Arrays.asList("Lambdas", "default method","Stream API","Data and Time API");
		
		/*Java provides a new method forEach() to iterate the elements.
         * It is defined in Iterable and Stream interface.
         * It is a default method defined in the Iterable interface.
         * Collection classes which extends Iterable interface can use forEach loop
         * to iterate elements.
         */
		features.forEach(n-> System.out.println(n)); 
		
		 List<String> gamesList = new ArrayList<String>();
         gamesList.add("Football");
         gamesList.add("Cricket");
         gamesList.add("Chess");
         gamesList.add("Hocky");
         System.out.println(("Lamda_expression"));
	
         
         
         
         *// Even better use Method reference feature of Java 8
         // method reference is denoted by :: (double colon) operator
         // looks similar to scope resolution operator of C++
          * */
          */
		
	}
}



