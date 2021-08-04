package Collection.demo;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
	//non genric data
	ArrayList  playerArray;
	List sublist;
	

	public PlayerList() {
		playerArray = new ArrayList();
		sublist=new ArrayList();
	}
	void addPlayer()
	{
		for(int i=0;i<5;i++)
		{
			 playerArray.add(i);//auto boxing
		}
		playerArray.add("rahul");
		playerArray.add("ranjan");
		playerArray.add("rakesh");
		playerArray.add("rajnit");
		System.out.println();
	}
	
	void search() {
        System.out.println();
        System.out.println("************************************"
        + "***********************");
        System.out.println("Search for an object and return "
        + "the first and last position");
        System.out.println("*********************************"
        + "***************************");
        System.out.println();
        System.out.println("First occurance of the String"
        + " \"Serena\" is at position " + playerArray.indexOf("Serena"));
        System.out.println("Last occurance of the String"
        + " \"Serena\" is at position  " + playerArray.lastIndexOf("Serena"));
        System.out.println();
    }
	void extract() {
        System.out.println("***************************"
        + "*********************");
        System.out.println("Extract a sublist and "
        + "then print the new List ");
        System.out.println("************************"
        + "*************************");
        System.out.println();
        sublist = playerArray.subList(5, playerArray.size());
        System.out.println("New Sub-List from index 5 to "
        + playerArray.size() + " is : " + sublist);
        System.out.println();
    }


	public static void main(String[] args) {
		 PlayerList p=new PlayerList();
		 p.addPlayer();
		 p.search();
		 p.extract();
		 

	}

}
