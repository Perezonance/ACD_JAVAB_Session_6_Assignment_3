package student;

public class TestStudent {
	public static void main(String[] args) throws HighGradeException, NegativeGradeException {
		Student s1 = new Student(2.5);
		Student s2 = new Student(-2.2);
		Student s3 = new Student(5.2);
		
		try {
			s1.promote();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s2.promote();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s3.promote();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
