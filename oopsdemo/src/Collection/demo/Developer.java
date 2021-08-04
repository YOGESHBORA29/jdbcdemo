package Collection.demo;

import java.util.Comparator;

public class Developer {
	int id ;
	String name,domain;
	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
	}
}
class idcomparator implements Comparator
{
	private int compare(Object o1, Object o2)
	{
		Developer d1=(Developer)o1;
		Developer d2=(Developer)o2;
		if(d1.id==d2.id)
			return(0);
		else if(d1.id>d2.id)
			return(1);
		else 
			return (1);
		
					
		
	}

}
