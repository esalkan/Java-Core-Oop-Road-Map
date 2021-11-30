package oop.day_37_Inheritance;

/**
 * @author esalkan
 *
 */
public class _07_FinalExam extends _06_GradeActivity {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;

	public _07_FinalExam(int numQuestions, int numMissed) {

		double numericScore;

		this.numQuestions = numQuestions;
		this.numMissed = numMissed;

		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);

		// My goal is to receive the letter based on my numericScore how i will set my
		// numericScore to score
		setScore(numericScore);
	}

}
