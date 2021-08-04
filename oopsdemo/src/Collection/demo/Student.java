package Collection.demo;

public class Student implements Comparable<Student>{
int rollno;
int age;
public String name;

	public Student(int rollno, int age, String name) {
	this.rollno = rollno;
	this.age = age;
	this.name = name;
}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age<o.age)
		return(1);
		else 
			return(-1);
		
				
	}

}
