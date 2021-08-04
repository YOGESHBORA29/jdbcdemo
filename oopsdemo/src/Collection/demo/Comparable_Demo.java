package Collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparable_Demo {

	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<Student>();
		Student s1=new Student(101,19,"mike");
		Student s2=new Student(102,19,"mike");
		Student s3=new Student(103,19,"mike");
		Student s4=new Student(104,19,"mike");
		Student s5=new Student(104,19,"mike");
		Student s6=new Student(105,19,"mike");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		Collections.sort(s);
		for(Student a:s)
		{
			System.out.println(a.age+a.name+a.rollno);
		}
		

	}

}
