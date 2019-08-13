package student;

public class NegativeGradeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeGradeException(String msg){
		super(msg);
	}
	public NegativeGradeException(){
		super("Grade is below 0!");
	}

}
