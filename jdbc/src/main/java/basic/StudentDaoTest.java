package basic;

public class StudentDaoTest {

	public static void main(String[] args) {
		Studentdao sd = new Studentdao();
		Student s= new Student(132, "Vivek", "vivek@gmail.com");
		Student s1= new Student(127, "Saksh ", "sakshi@gmail.com");
		
	//sd.savestudent(s);
// sd.updatestudent(s1);
//sd.deletestudent(132);
sd.getallstudent();

	}

}
