package iVoteService;

public interface Question {
	
	void printAnswers();
	void printQuestion();
	int getNumChoices();
	String getA();
	String getB();
	String getC();
	String getD();
}
