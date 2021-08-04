package OOPSDEMO3;

public class StudentDetails implements Collage_Data,Hostal_data {
	Collage c= new Collage("yogesh",500,"amity","cse");
	Hostal h=new Hostal("delhi","near gola ka mandir");

	@Override
	public void student_details() {
System.out.println("***************************Student details**********************");
System.out.println("name "+c.name);
System.out.println("id"+c.id);
		
	}

	@Override
	public void Hostal_details() {
		
		System.out.println("Hostal name "+h.name);
		System.out.println("hostal location="+h.location);
	}

	@Override
	public void collegeDetail() {
		System.out.println("name "+c.name);
		System.out.println("id"+c.id);
		System.out.println("university"+c.university);
		System.out.println("course"+c.course);
	
	}

	@Override
	public void studentData() {
		System.out.println("course bca baa");
		
	}
public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.collegeDetail();
		s.Hostal_details();
		s.studentData();

	}

}
