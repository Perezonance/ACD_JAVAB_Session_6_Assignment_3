package student;

public class HighGradeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HighGradeException(String msg){
		super(msg);
	}
	public HighGradeException(){
		super("Grade is higher than 100!");
	}

}
