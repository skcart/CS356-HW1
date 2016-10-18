package iVoteService;

public class Student {
	protected int ID;
	protected int vote = -1;
	
	/**
	 * Constructor for Student class
	 * 
	 * @param ID: Students unique identification element
	 */
	public Student(int ID) {
		this.ID = ID;
	}
	
	/**
	 * Returns a student's ID
	 * 
	 * @return ID
	 */
	protected int getID() {
		return ID;
	}
	
	/**
	 * Sets a students vote in a poll
	 * 
	 * @param vote:	Student's vote in a poll represented as int
	 */
	protected void setVote(int vote) {
		this.vote = vote;
	}
	
	/**
	 * Returns a student's vote in a poll
	 * 
	 * @return vote
	 */
	protected int getVote() {
		return vote;
	}
}
