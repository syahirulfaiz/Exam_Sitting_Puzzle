import java.util.Arrays;

import static java.util.Arrays.stream;
/**
 * Main class to take the exam; it computes the worst possible grade when
 * using the protocol implemented in ExamCheatingCode.
 *
 */
public class SitExam {

	private static final  int N_QUESTIONS = 20, N_HONKS = 10;
	public static void main(String[] args) {
		int[] exam = new int[N_QUESTIONS];
		int minGrade = N_QUESTIONS;
		ExamCheatingCode protocol = new ExamCheatingCode();
		while (true) {
			int grade = 0;
			int[] code = protocol.computeAndSendTheCode(exam); // return 10 bit based on exam solution
			if (code.length != N_HONKS ||
					!stream(code).allMatch(bit -> bit == 0 || bit == 1))
				throw new IllegalArgumentException("Illegal code!");
			int[] answers = protocol.enterSolutionBasedOnCode(code); // return the answers to the test
			for (int i = 0; i < N_QUESTIONS; i++)  // check how many answers are correct
				if (answers[i] == exam[i]) grade++;
			if (grade < minGrade) minGrade = grade;
			if (stream(exam).allMatch(i -> i == 1)) break;
			increment(exam); // generate next exam
		}
		System.out.println(minGrade);
	}

	private static void increment(int[] bits) {
		for (int i = 0; i < N_QUESTIONS; i++) {
			if (bits[i] == 0) {
				bits[i]++;
				return;
			} else {
				bits[i] = 0;
			}
		}
	}
}
    

