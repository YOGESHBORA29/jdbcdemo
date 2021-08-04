import java.util.HashSet;
import java.util.Set;

public class hashset_user_define {

	public static void main(String[] args) {
	Set<Customer> s=new HashSet<Customer>(); 
s.add(new Customer(101,"Arun","Bengulur"));
s.add(new Customer(102,"rakesh","channei"));
s.add(new Customer(103,"ram","mumbai"));
s.add(new Customer(104,"shaam","delhi"));
//add duplicate
s.add(new Customer(105,"Arun","Bengulur"));

for(Customer i:s)
{
	System.out.println(""+i.getId()+""+i.getName()+i.getCity());}
	}

}
