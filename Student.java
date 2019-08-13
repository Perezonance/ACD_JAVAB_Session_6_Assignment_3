package student;

public class Student {
	
	private double gpa;
	
	Student(){
		
	}
	Student(double gpa){
		this.gpa = gpa;
	}
	
	public void promote() throws HighGradeException, NegativeGradeException{
		if(gpa < 0)
			throw new NegativeGradeException();
		if(gpa > 4.0)
			throw new HighGradeException();
		if(gpa > 2.0)
			System.out.println("Student is Promoted to the next Grade!");
		else
			System.out.println("Student is not Promoted to thenext Grade!");
	}
}
