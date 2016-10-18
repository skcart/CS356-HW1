package iVoteService;

public class TrueFalseQuestion implements Question {
	String prompt;
	String A = "True";
	String B = "False";
	int numChoices = 2;
	
	/**
	 * Constructor for a T/F question
	 * 
	 * @param prompt: Question to be asked
	 */
	protected TrueFalseQuestion(String prompt) {
		this.prompt = prompt;
	}
	
	/**
	 * Prints the possible options (true/false)
	 */
	public void printAnswers() {
		System.out.println(A);
		System.out.println(B);		
	}
	
	/**
	 * Prints the question text
	 */
	public void printQuestion() {
		System.out.println(prompt);
	}	
	
	/**
	 * Returns the number of choices in a True/False question.
	 */
	public int getNumChoices() {
		return numChoices;		
	}

	/**
	 * Returns text for option A
	 */
	public String getA() {
		return A;
	}

	/**
	 * Returns text for option B
	 */
	public String getB() {
		return B;
	}

	/**
	 * Returns text for option C
	 */
	public String getC() {
		return null;
	}

	/**
	 * Returns text for option D
	 */
	public String getD() {
		return null;
	}
}
