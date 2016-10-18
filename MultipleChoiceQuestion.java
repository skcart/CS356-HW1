package iVoteService;

public class MultipleChoiceQuestion implements Question {

	String prompt, A, B, C, D;
	int numChoices = 4;
	
	/**
	 * Constructor for a multiple choice question.
	 * 
	 * @param prompt: Question to be asked
	 * @param A: Text for option A
	 * @param B: Text for option B
	 * @param C: Text for option C
	 * @param D: Text for option D
	 */
	protected MultipleChoiceQuestion(String prompt, String A, String B, String C, String D) {
		this.prompt = prompt;
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	/**
	 * Prints the possible options for this question
	 */
	public void printAnswers() {
		System.out.println("[A] " + A);
		System.out.println("[B] " + B);
		System.out.println("[C] " + C);
		System.out.println("[D] " + D);
	}
	
	/**
	 * Prints the question text
	 */
	public void printQuestion() {
		System.out.println(prompt);
	}

	/**
	 * Returns the number of choices in the multiple choice question
	 */
	public int getNumChoices() {
		return numChoices;		
	}

	/**
	 * Returns text for option A
	 */
	public String getA() {
		return ("[A] " + A);
	}

	/**
	 * Returns text for option B
	 */
	public String getB() {
		return ("[B] " + B);
	}

	/**
	 * Returns text for option C
	 */
	public String getC() {
		return ("[C] " + C);
	}

	/**
	 * Returns text for option D
	 */
	public String getD() {
		return ("[D] " + D);
	}	
}
