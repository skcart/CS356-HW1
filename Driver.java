package iVoteService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Poll question = null;
		
		// Determine poll type
		System.out.println("What type of question?");
		System.out.println("[1] Multiple Choice");
		System.out.println("[2] True/False");
		int resp = sc.nextInt();
		
		try { 
			if (resp == 1) {	// Poll is Multiple Choice
				System.out.println("Input question:");
				String prompt = br.readLine(); 
				
				System.out.println("Input answer A: ");
				String A = br.readLine();

				System.out.println("Input answer B: ");
				String B = br.readLine();

				System.out.println("Input answer C: ");
				String C = br.readLine();

				System.out.println("Input answer D: ");
				String D = br.readLine();
				
				question = new Poll(new MultipleChoiceQuestion(prompt, A, B, C, D));
			}
			
			else if (resp == 2) {	// Poll is True/False question
				System.out.println("Input question:");
				String prompt = br.readLine(); 
				
				question = new Poll(new TrueFalseQuestion(prompt));
			}
			
			else {	// Invalid input
				System.out.println("Invalid question type");
			}
			
		} catch (IOException e) { e.printStackTrace(); }
		
		// Run a simulation and retrieve results for the poll
		if (question != null) {		
			question.simulatePoll();
			question.getResults();
		}
	}
}
