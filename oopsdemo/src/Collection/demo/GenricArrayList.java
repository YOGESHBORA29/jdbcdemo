package Collection.demo;

import java.util.ArrayList;

public class GenricArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strLst = new ArrayList<String>();

	      strLst.add("alpha");   // compiler checks if argument is of type String
	      strLst.add("beta");
	      //itrate useing for loop
	      for(int i=0;i<strLst.size();i++)
	      {
	    	  String str = strLst.get(i);
	    	  System.out.println(str);
	      }

	}

}
