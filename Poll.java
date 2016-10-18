package iVoteService;

import java.util.ArrayList;
import java.util.Random;

public class Poll {
	Question question;
	ArrayList<Student> students;
	
	/**
	 * Constructor for Poll. Pass in a question to generate a poll
	 * 
	 * @param question: Question to be polled
	 */
	protected Poll(Question question) {
		this.question = question;
	}
	
	/**
	 * Print the question's prompt
	 */
	protected void printQuestion() {
		question.printQuestion();
	}
	
	/**
	 * Print the question's possible options
	 */
	protected void printAnswers() {
		question.printAnswers();
	}
	
	/**
	 * Simulate the poll with 1-50 random students selecting random answers
	 */
	protected void simulatePoll() { 		
		students = new ArrayList<Student>();
		Random r = new Random();
		int numStudents = r.nextInt(50) + 1;

		System.out.println("\nSimulating results with " + numStudents + " students...\n");
		
		// Generate random # of students 1-50
		for (int i = 0; i < numStudents; i++) {
			students.add(new Student(i));
		}
		
		// Randomly generate a student's vote
		for (Student s : students) {
			s.setVote(r.nextInt(question.getNumChoices()));
		}
	}
	
	/**
	 * Get the results of a poll
	 */
	protected void getResults() {
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		// Initialize results array
		for (int i = 0; i < question.getNumChoices(); i++) {
			results.add(0);
		}
		
		for (Student s : students) {
			// Increment the answer which this student voted for
			results.set(s.getVote(), results.get(s.getVote()) + 1);
		}
		
		// Print out the results
		for (int i = 0; i < question.getNumChoices(); i++) {
			if (i == 0) System.out.println(question.getA());
			if (i == 1) System.out.println(question.getB());
			if (i == 2) System.out.println(question.getC());
			if (i == 3) System.out.println(question.getD());
			
			System.out.println(results.get(i) + " votes. \n");
		}
		
	}
}